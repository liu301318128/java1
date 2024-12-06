package com.example.qingyao_liu_comp228lab5;

import java.sql.*;

public class DatabaseHelper {
    private static final String DB_URL = "jdbc:oracle:thin:@199.212.26.208:1521:SQLD";
    private static final String DB_USER = "COMP228_F24_soh_48";
    private static final String DB_PASSWORD = "111111";

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    public void insertPlayer(String firstName, String lastName, String address, String postalCode, String province, String phoneNumber) throws SQLException {
        String sql = "INSERT INTO Qingyao_Liu_player (first_name, last_name, address, postal_code, province, phone_number) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, address);
            stmt.setString(4, postalCode);
            stmt.setString(5, province);
            stmt.setString(6, phoneNumber);
            stmt.executeUpdate();
        }
    }

    public ResultSet getPlayerAndGames(int playerId) throws SQLException {
        String sql = "SELECT p.first_name, p.last_name, g.game_title, pg.playing_date, pg.score " +
                "FROM Qingyao_Liu_player p " +
                "JOIN Qingyao_Liu_player_and_game pg ON p.player_id = pg.player_id " +
                "JOIN Qingyao_Liu_game g ON pg.game_id = g.game_id " +
                "WHERE p.player_id = ?";
        Connection conn = connect();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, playerId);
        return stmt.executeQuery();
    }

    // 新增测试方法
    public void testConnection() {
        try (Connection conn = connect()) {
            if (conn != null) {
                System.out.println("Successfully connected to the database!");
            } else {
                System.out.println("Failed to connect to the database.");
            }
        } catch (SQLException e) {
            System.out.println("Connection test failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
