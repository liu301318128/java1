public class ChildrenBook extends Book {

    public ChildrenBook(String title, String ISBN, String publisher, int year) {
        super(title, ISBN, publisher, year);
    }

    @Override
    public void setPrice(double price) {
        // Set the fixed price for children books rule
        setPriceInternal(price);
    }

    @Override
    public String getGenre() {
        return "Children";
    }
}
