package exercise2;

import java.util.Random;

public class Lotto {
    private int[] lottoNumbers; // Array to hold the random numbers

    // Constructor to populate the array with random values from 1 to 9
    public Lotto() {
        lottoNumbers = new int[3];
        Random random = new Random();
        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = random.nextInt(9) + 1; // Random number between 1 and 9
        }
    }

    // Method to return the array of lotto numbers
    public int[] getLottoNumbers() {
        return lottoNumbers;
    }

    // Method to calculate the sum of the lotto numbers
    public int getSum() {
        int sum = 0;
        for (int number : lottoNumbers) {
            sum += number;
        }
        return sum;
    }
}
