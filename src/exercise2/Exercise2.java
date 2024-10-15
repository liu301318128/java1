package exercise2;

import javax.swing.JOptionPane;

public class Exercise2 {
    public static void main(String[] args) {
        Lotto lotto;
        int userGuess;
        int maxAttempts = 5;
        boolean hasWon = false;

        // Loop for up to 5 attempts
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            // Prompt user for a guess
            userGuess = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 3 and 27 (Attempt " + attempt + " of " + maxAttempts + "):"));

            // Create a new Lotto object and calculate the sum of numbers
            lotto = new Lotto();
            int sum = lotto.getSum();

            // Check if the user's guess matches the sum
            if (userGuess == sum) {
                JOptionPane.showMessageDialog(null, "Congratulations! You won! The lotto numbers were: " + lotto.getLottoNumbers()[0] + ", " + lotto.getLottoNumbers()[1] + ", " + lotto.getLottoNumbers()[2]);
                hasWon = true;
                break; // Exit the loop if the user wins
            } else {
                JOptionPane.showMessageDialog(null, "Sorry! The sum was " + sum + ". Try again!");
            }
        }

        // If the user didn't win after 5 attempts
        if (!hasWon) {
            JOptionPane.showMessageDialog(null, "You lost! Better luck next time.");
        }
    }
}
