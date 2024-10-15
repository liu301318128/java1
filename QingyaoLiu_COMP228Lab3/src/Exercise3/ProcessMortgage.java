package Exercise3;

// Interface to define constants for mortgage terms and other related values
interface MortgageConstants {
    int SHORT_TERM = 1;  // Short-term mortgage (1 year)
    int MEDIUM_TERM = 3;  // Medium-term mortgage (3 years)
    int LONG_TERM = 5;  // Long-term mortgage (5 years)
    double MAX_MORTGAGE_AMOUNT = 300000;  // Maximum mortgage amount
    String BANK_NAME = "CityToronto Bank";  // Bank name
}

// Abstract class representing a Mortgage
abstract class Mortgage {
    protected String mortgageNumber;  // Unique identifier for the mortgage
    protected String customerName;    // Name of the customer
    protected double mortgageAmount;  // Amount of the mortgage
    protected double interestRate;    // Interest rate for the mortgage
    protected int term;               // Term of the mortgage (in years)

    // Constructor to initialize mortgage details
    public Mortgage(String mortgageNumber, String customerName, double mortgageAmount, int term) {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        // Ensure mortgage amount does not exceed the maximum allowed
        this.mortgageAmount = Math.min(mortgageAmount, MortgageConstants.MAX_MORTGAGE_AMOUNT);
        // Set term to short-term if it's not one of the defined constants
        this.term = (term != MortgageConstants.SHORT_TERM && term != MortgageConstants.MEDIUM_TERM && term != MortgageConstants.LONG_TERM)
                ? MortgageConstants.SHORT_TERM
                : term;
    }

    // Abstract method to set interest rate, to be implemented by subclasses
    public abstract void setInterestRate(double primeRate);

    // Method to display mortgage information
    public void getMortgageInfo() {
        System.out.println("Mortgage Number: " + mortgageNumber +
                ", Customer: " + customerName +
                ", Amount: $" + mortgageAmount +
                ", Term: " + term + " years" +
                ", Interest Rate: " + interestRate + "%");
    }
}

// Subclass representing a Business Mortgage
class BusinessMortgage extends Mortgage {
    // Constructor to initialize business mortgage details
    public BusinessMortgage(String mortgageNumber, String customerName, double mortgageAmount, int term) {
        super(mortgageNumber, customerName, mortgageAmount, term);  // Call to superclass constructor
    }

    @Override
    public void setInterestRate(double primeRate) {
        this.interestRate = primeRate + 1.0;  // Business mortgage interest rate is 1% above prime rate
    }
}

// Subclass representing a Personal Mortgage
class PersonalMortgage extends Mortgage {
    // Constructor to initialize personal mortgage details
    public PersonalMortgage(String mortgageNumber, String customerName, double mortgageAmount, int term) {
        super(mortgageNumber, customerName, mortgageAmount, term);  // Call to superclass constructor
    }

    @Override
    public void setInterestRate(double primeRate) {
        this.interestRate = primeRate + 2.0;  // Personal mortgage interest rate is 2% above prime rate
    }
}

// Driver class to process mortgages
public class ProcessMortgage {
    public static void main(String[] args) {
        // Array to store mortgage objects
        Mortgage[] mortgages = new Mortgage[3];

        // Example of creating mortgage objects
        mortgages[0] = new BusinessMortgage("001", "Alice", 250000, MortgageConstants.MEDIUM_TERM);
        mortgages[1] = new PersonalMortgage("002", "Bob", 200000, MortgageConstants.SHORT_TERM);

        // Set the prime rate (example: 5%)
        double primeRate = 5.0;

        // Loop through the array, set interest rates, and display mortgage info
        for (Mortgage mortgage : mortgages) {
            if (mortgage != null) {
                mortgage.setInterestRate(primeRate);  // Set interest rate based on prime rate
                mortgage.getMortgageInfo();  // Display mortgage information
            }
        }
    }
}
