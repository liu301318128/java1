public class Singers {

    private int singerId;
    private String singerName;
    private String singerAddress;
    private String dateOfBirth;
    private int albumsPublished;

    // No-argument constructor
    public Singers() {
        this.singerId = 0;
        this.singerName = "Unknown";
        this.singerAddress = "Unknown";
        this.dateOfBirth = "Unknown";
        this.albumsPublished = 0;
    }

    // Constructor with 1 argument
    public Singers(int singerId) {
        this();
        this.singerId = singerId;
    }

    // Constructor with 2 arguments
    public Singers(int singerId, String singerName) {
        this(singerId);
        this.singerName = singerName;
    }

    // Constructor with 3 arguments
    public Singers(int singerId, String singerName, String singerAddress) {
        this(singerId, singerName);
        this.singerAddress = singerAddress;
    }

    // Constructor with 4 arguments
    public Singers(int singerId, String singerName, String singerAddress, String dateOfBirth) {
        this(singerId, singerName, singerAddress);
        this.dateOfBirth = dateOfBirth;
    }

    // Constructor with 5 arguments
    public Singers(int singerId, String singerName, String singerAddress, String dateOfBirth, int albumsPublished) {
        this(singerId, singerName, singerAddress, dateOfBirth);
        this.albumsPublished = albumsPublished;
    }

    // Setters (Mutators)
    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public void setSingerAddress(String singerAddress) {
        this.singerAddress = singerAddress;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAlbumsPublished(int albumsPublished) {
        this.albumsPublished = albumsPublished;
    }

    // Setter to set all attributes at once
    public void setSingerDetails(int singerId, String singerName, String singerAddress, String dateOfBirth, int albumsPublished) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.albumsPublished = albumsPublished;
    }

    // Getters (Accessors)
    public int getSingerId() {
        return singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public String getSingerAddress() {
        return singerAddress;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAlbumsPublished() {
        return albumsPublished;
    }

    // Method to display Singer details
    public void displaySingerDetails() {
        System.out.println("Singer ID: " + singerId);
        System.out.println("Singer Name: " + singerName);
        System.out.println("Singer Address: " + singerAddress);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Number of Albums Published: " + albumsPublished);
    }
}
