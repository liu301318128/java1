package exercise1;

import javax.swing.JOptionPane;
import java.util.Random;

public class Test {
    private String[] questions = {
            "Question 1: What is the capital of Canada?\n1) Toronto\n2) Ottawa\n3) Vancouver\n4) Montreal",
            "Question 2: What is 2 + 2?\n1) 3\n2) 4\n3) 5\n4) 6",
            "Question 3: Which language is primarily used for Android development?\n1) Java\n2) C++\n3) Python\n4) C#",
            "Question 4: What does HTML stand for?\n1) Hyper Text Markup Language\n2) Hyperlinks and Text Markup Language\n3) High-level Text Markup Language\n4) None of the above",
            "Question 5: What year did Java release?\n1) 1991\n2) 1995\n3) 2000\n4) 1998"
    };

    private int[] answers = {2, 2, 1, 1, 2}; // Correct answers based on question index
    private Random random = new Random();
    private int correctCount = 0; // Declare correctCount

    public void inputAnswer() {
        int totalQuestions = questions.length;

        for (int i = 0; i < totalQuestions; i++) {
            String userAnswer = JOptionPane.showInputDialog(questions[i]);
            try {
                int answer = Integer.parseInt(userAnswer);
                checkAnswer(i, answer);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number between 1 and 4.");
                i--; // Ask the same question again
            }
        }

        JOptionPane.showMessageDialog(null, "You got " + correctCount + " correct out of " + totalQuestions);
        JOptionPane.showMessageDialog(null, "Your score percentage is: " + (correctCount * 100 / totalQuestions) + "%");
    }

    private void checkAnswer(int questionIndex, int userAnswer) {
        String message;
        if (userAnswer == answers[questionIndex]) {
            message = generateMessage(true);
            JOptionPane.showMessageDialog(null, message);
            correctCount++; // Increment correctCount
        } else {
            message = generateMessage(false);
            JOptionPane.showMessageDialog(null, message + "\nThe correct answer is: " + answers[questionIndex]);
        }
    }

    private String generateMessage(boolean isCorrect) {
        String[] correctMessages = {"Excellent!", "Good!", "Keep up the good work!", "Nice work!"};
        String[] incorrectMessages = {"No. Please try again", "Wrong. Try once more", "Don't give up!", "No. Keep trying.."};

        if (isCorrect) {
            return correctMessages[random.nextInt(correctMessages.length)];
        } else {
            return incorrectMessages[random.nextInt(incorrectMessages.length)];
        }
    }

    public static void main(String[] args) {
        Test test = new Test(); // Create Test object
        test.inputAnswer(); // Call inputAnswer method
    }
}
