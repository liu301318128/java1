package exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountTest {
    public static void main(String[] args) {
        // Create an Account with an initial balance of $1000
        Account account = new Account(1000);

        // Create a list of transactions
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(account, "deposit", 500));
        transactions.add(new Transaction(account, "withdraw", 200));
        transactions.add(new Transaction(account, "withdraw", 300));
        transactions.add(new Transaction(account, "withdraw", 1000));
        transactions.add(new Transaction(account, "deposit", 700));

        // Create an ExecutorService to manage threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Execute each transaction in the list
        for (Transaction transaction : transactions) {
            executorService.execute(transaction);
        }

        // Shut down the ExecutorService
        executorService.shutdown();
    }
}
