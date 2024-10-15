package Exercise2;

abstract class GameTester {
    protected String name;         // Name of the game tester
    protected boolean isFullTime;  // Status of the game tester (true if full-time)

    // Constructor to initialize name and full-time status
    public GameTester(String name, boolean isFullTime) {
        this.name = name;
        this.isFullTime = isFullTime;
    }

    // Abstract method to determine salary, to be implemented by subclasses
    public abstract double determineSalary();
}

// Subclass representing a Full-time Game Tester
class FullTimeGameTester extends GameTester {
    public FullTimeGameTester(String name) {
        super(name, true);  // Full-time status is always true for this class
    }

    @Override
    public double determineSalary() {
        return 3000;  // Fixed salary of $3000 for full-time testers
    }
}

// Subclass representing a Part-time Game Tester
class PartTimeGameTester extends GameTester {
    private int hoursWorked;  // Number of hours worked by the part-time tester

    // Constructor to initialize name, hours worked, and part-time status
    public PartTimeGameTester(String name, int hoursWorked) {
        super(name, false);  // Part-time status is always false for this class
        this.hoursWorked = hoursWorked;  // Setting the number of hours worked
    }

    @Override
    public double determineSalary() {
        return 20 * hoursWorked;  // Part-time testers earn $20 per hour
    }
}

// Driver class to test the GameTester hierarchy
public class GameTesterTest {
    public static void main(String[] args) {
        // Creating a full-time tester
        GameTester tester1 = new FullTimeGameTester("Alice");
        // Creating a part-time tester who worked 40 hours
        GameTester tester2 = new PartTimeGameTester("Bob", 40);

        // Displaying the salaries for both testers
        System.out.println("Full-Time Tester Salary: $" + tester1.determineSalary());
        System.out.println("Part-Time Tester Salary: $" + tester2.determineSalary());
    }
}
