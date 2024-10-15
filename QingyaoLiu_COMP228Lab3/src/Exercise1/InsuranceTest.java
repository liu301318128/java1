package Exercise1;



public class InsuranceTest {
    public static void main(String[] args) {
        Insurance[] insurances = new Insurance[2];  // Array to store different types of insurance

        // Create Health and Life Insurance objects and add to array
        insurances[0] = new Health();
        insurances[1] = new Life();

        // Example of setting insurance cost
        insurances[0].setInsuranceCost(200.0);  // Setting cost for Health Insurance
        insurances[1].setInsuranceCost(150.0);  // Setting cost for Life Insurance

        // Loop through the array and display each insurance's information
        for (Insurance insurance : insurances) {
            insurance.displayInfo();  // Polymorphic call to displayInfo()
        }
    }
}
