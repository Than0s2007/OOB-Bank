public class Account {
    // props

    private int number;
    private String holder_name;
    private double current_balance;
    private static int counter = 0;

    // Constractour
    public Account(String holder_name,double current_balance)
    {
        this.number = ++counter;
        this.holder_name = holder_name;
        this.current_balance = current_balance;
    }
    
    // Gettrs and Setters
    
    public int getNumber()
    {
        return this.number;
    }
    public String getHolderName()
    {
        return this.holder_name;
    }
    public void setHolderName (String holder_name)
    {
        this.holder_name = holder_name;
    }
    public double getCurrentBalance()
    {
        return  this.current_balance;
    }

    // operations
    public Boolean WithDrawal(double amount)
    {
        if (amount <= 0) {
            System.out.println("Amount Must Be Positive");
            return  false;
        } else if (amount > current_balance) {
            System.out.println("Insufficient Balance");
            return  false;
        } else {
            current_balance -= amount;
            System.out.println("Withdrawal Successful");
            return  true;
        }
    }
    public Boolean Deposite(double amount)
    {
        if (0 >= amount) {
            System.out.println("You Can't Perform This Operation .\nTry Again");
            return  false; 
        }
        else{
            current_balance += amount;
            System.out.println("Your Deposite Operation Done Successfulyy ..");
            return  true;
        }
    }
    public Boolean Transfer(Account receiver, double amount) {

        if (amount <= 0) {
            System.out.println("Amount Must Be Positive");
            return  false;
        }
        else if (this.current_balance < amount) {
            System.out.println("Insufficient Balance");
            return  false;
        }
        else {
            this.current_balance -= amount;
            receiver.current_balance += amount;

            System.out.println("Transfer Successful");
            return  true;
        }
    }
    
    
}
