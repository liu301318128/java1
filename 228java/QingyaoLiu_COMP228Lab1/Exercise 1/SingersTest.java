public class SingersTest {
    public static void main(String[] args) {
        // Create a Singer object using the no-argument constructor
        Singers singer1 = new Singers();

        // Display the default values of the instance variables
        System.out.println("Default Values:");
        singer1.displaySingerDetails();

        // Set the values of each instance variable using setters
        singer1.setSingerId(123123);
        singer1.setSingerName("Kath");
        singer1.setSingerAddress("123 TownCenter");
        singer1.setDateOfBirth("1988-08-08");
        singer1.setAlbumsPublished(5);

        // Display the updated values of the instance variables
        System.out.println("\nUpdated Values:");
        singer1.displaySingerDetails();
    }
}
