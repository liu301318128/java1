package exercise1;

public class Transaction implements Runnable {
    private final Account account;
    private final String transactionType;
    private final double amount;

    public Transaction(Account account, String transactionType, double amount) {
        this.account = account;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    @Override
    public void run() {
        if ("deposit".equalsIgnoreCase(transactionType)) {
            account.deposit(amount);
        } else if ("withdraw".equalsIgnoreCase(transactionType)) {
            account.withdraw(amount);
        } else {
            System.out.println(Thread.currentThread().getName() + ": Invalid transaction type.");
        }
    }
}
