import javax.swing.JOptionPane;

public class BookTest {

    public static void main(String[] args) {
        //Input for ScienceBook (showInputDialog method)
        String title = JOptionPane.showInputDialog("Enter the title of the science book:");
        String ISBN = JOptionPane.showInputDialog("Enter the ISBN of the science book:");
        String publisher = JOptionPane.showInputDialog("Enter the publisher of the science book:");
        int year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year of the science book:"));
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of the science book:"));

        ScienceBook scienceBook = new ScienceBook(title, ISBN, publisher, year);
        scienceBook.setPrice(price);

        //Input for ChildrenBook (showMessageDialog)
        title = JOptionPane.showInputDialog("Enter the title of the children book:");
        ISBN = JOptionPane.showInputDialog("Enter the ISBN of the children book:");
        publisher = JOptionPane.showInputDialog("Enter the publisher of the children book:");
        year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year of the children book:"));
        price = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of the children book:"));

        ChildrenBook childrenBook = new ChildrenBook(title, ISBN, publisher, year);
        childrenBook.setPrice(price);

        //Display book information
        JOptionPane.showMessageDialog(null, "Science Book Info:\n" + scienceBook.toString() + "\nGenre: " + scienceBook.getGenre());
        JOptionPane.showMessageDialog(null, "Children Book Info:\n" + childrenBook.toString() + "\nGenre: " + childrenBook.getGenre());
    }
}
