
public abstract class Book {
    private String title;
    private String ISBN;
    private String publisher;
    private int year;
    private double price;
    //Constructor
    public Book(String title, String ISBN, String publisher, int year) {
        this.title = title;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.year = year;
    }

    //Getters and Setters (do not provide a direct setter for price)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    protected void setPriceInternal(double price) {  //New method to set the price
        this.price = price;
    }

    //Abstract method setPrice(double price) and getGenre()
    public abstract void setPrice(double price);

    public abstract String getGenre();

    // toString() method to return all details
    @Override
    public String toString() {
        return "Title: " + title + "\nISBN: " + ISBN + "\nPublisher: " + publisher + "\nYear: " + year + "\nPrice: $" + price;
    }
}
