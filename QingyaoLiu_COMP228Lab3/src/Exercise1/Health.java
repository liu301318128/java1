package Exercise1;

// Subclass representing Health Insurance
class Health extends Insurance {
    @Override
    public void setInsuranceCost(double cost) {
        this.monthlyCost = cost;  // Setting the cost for Health Insurance
        this.insuranceType = "Health Insurance";  // Setting insurance type
    }

    @Override
    public void displayInfo() {
        // Displaying the information for Health Insurance
        System.out.println("Type: " + insuranceType + ", Monthly Cost: $" + monthlyCost);
    }
}