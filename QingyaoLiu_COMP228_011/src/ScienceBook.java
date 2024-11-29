public class ScienceBook extends Book {

    public ScienceBook(String title, String ISBN, String publisher, int year) {
        super(title, ISBN, publisher, year);
    }

    @Override
    public void setPrice(double price) {
        //10% discount for science books rule
        double discountedPrice = price - (price * 0.10);
        setPriceInternal(discountedPrice);
    }

    @Override
    public String getGenre() {
        return "Science";
    }
}
