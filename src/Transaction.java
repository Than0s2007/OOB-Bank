import java.time.Instant;

public class Transaction {
    private static int counter = 0;
    private int TransactionId; 
    private String type;
    private String details;
    private double amount;
    private Integer senderAccountNumber;
    private Integer receiverAccountNumber;
    private Instant timestamp;

    public Transaction(
            String type,
            String details,
            double amount,
            Integer senderAccountNumber,
            Integer receiverAccountNumber) {

        this.type = type;
        this.details = details;
        this.amount = amount;
        this.senderAccountNumber = senderAccountNumber;
        this.receiverAccountNumber = receiverAccountNumber;
        this.timestamp = Instant.now();
        TransactionId = ++counter;
    }

    public void DisplayTransaction() {
        System.out.println("Transaction Id : "+TransactionId);
        System.out.println("Type: " + type);
        System.out.println("Details: " + details);
        System.out.println("Amount: " + amount);
        System.out.println("Sender Account: " + senderAccountNumber);
        System.out.println("Receiver Account: " + receiverAccountNumber);
        System.out.println("Time Of Operation: " + timestamp);
    }

    public int getSenderAccountNumber()
    {
        return this.senderAccountNumber;
    }
    public int getReciverAccountNumber()
    {
        return this.receiverAccountNumber;
    }
    public int getTransactionId(){
        return this.TransactionId;
    }
}