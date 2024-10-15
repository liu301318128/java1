package Exercise1;

abstract class Insurance {
    protected String insuranceType;  // Type of insurance (Health, Life, etc.)
    protected double monthlyCost;    // Monthly cost of the insurance

    // Getter methods for insurance type and cost
    public String getInsuranceType() { return insuranceType; }
    public double getMonthlyCost() { return monthlyCost; }

    // Abstract methods to be implemented by subclasses
    public abstract void setInsuranceCost(double cost);
    public abstract void displayInfo();
}
