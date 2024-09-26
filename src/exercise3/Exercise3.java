package exercise3;

public class Exercise3 {
    // First overloaded method: takes one int parameter
    public static int calculate(int a) {
        return a * a; // Returns the square of the integer
    }

    // Second overloaded method: takes two int parameters
    public static int calculate(int a, int b) {
        return a + b; // Returns the sum of the two integers
    }

    // Third overloaded method: takes one double parameter
    public static double calculate(double a) {
        return a * 2.5; // Returns the value multiplied by 2.5
    }

    public static void main(String[] args) {
        // Call each overloaded method and display the results
        int result1 = calculate(5);
        int result2 = calculate(3, 4);
        double result3 = calculate(2.0);

        System.out.println("Result of calculate(int): " + result1); // Outputs 25
        System.out.println("Result of calculate(int, int): " + result2); // Outputs 7
        System.out.println("Result of calculate(double): " + result3); // Outputs 5.0
    }
}
