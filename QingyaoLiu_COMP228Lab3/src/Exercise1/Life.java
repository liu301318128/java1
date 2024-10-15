package Exercise1;

class Life extends Insurance {
    @Override
    public void setInsuranceCost(double cost) {
        this.monthlyCost = cost;  // Setting the cost for Life Insurance
        this.insuranceType = "Life Insurance";  // Setting insurance type
    }

    @Override
    public void displayInfo() {
        // Displaying the information for Life Insurance
        System.out.println("Type: " + insuranceType + ", Monthly Cost: $" + monthlyCost);
    }
}