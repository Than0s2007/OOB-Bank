import java.util.*;
public class Bank {
    public Bank(){}

    public ArrayList<Account> accounts = new ArrayList<Account>();
    public ArrayList<Transaction> transactions = new ArrayList<>();
    
    public void DisplayAllAccounts()
    {
        System.out.println("Our Bank Accounts Informations");
        for (Account acc : accounts) {
            System.out.println("###########################################");
            System.out.println("Account Number : "+acc.getNumber());
            System.out.println("Account Holder Name : "+acc.getHolderName());
            System.out.println("Account Balance : "+acc.getCurrentBalance());
        }
        System.out.println("###########################################");
    };
    public void RetrieveAccount(int AccNumber)
    {
        Boolean exist = false;
        for (Account acc : accounts) {
            if(acc.getNumber() == AccNumber){
            exist = true;
            System.out.println("Account Number : "+acc.getNumber());
            System.out.println("Account Holder Name : "+acc.getHolderName());
            System.out.println("Account Balance : "+acc.getCurrentBalance());
            break;
            }
        }
        if (!exist) System.out.println("This Account Number Is Not Exist In This Bank ");
    }
    public void DeleteAccount(int AccountNumber){
        Boolean exist = false;
        for (Account acc : accounts) {
            if(acc.getNumber() == AccountNumber){
            exist = true;
            accounts.remove(acc);
            System.out.println("Your Account Removed Successfuly");
            break;
            }
        }
        if (!exist) System.out.println("This Account Number Is Not Exist In This Bank ");
    }
    public void AddAccountToBank(String holder_name,double current_balance){
        Account acc = new Account(holder_name, current_balance);
        accounts.add(acc);
        System.out.println("Account Addedd Successfuly");
    }
    public void TransferMoney(int senderNumber, int receiverNumber, double amount) {

        Account sender = null;
        Account receiver = null;

        for (Account acc : accounts) {

            if (acc.getNumber() == senderNumber) {
                sender = acc;
            }

            if (acc.getNumber() == receiverNumber) {
                receiver = acc;
            }
        }

        if (sender == null || receiver == null) {
            System.out.println("One or Both Accounts Not Found");
            return;
        }

        boolean operation = sender.Transfer(receiver, amount);
        if (operation) {
            transactions.add(new Transaction("Transfer Money", "Successfuly Transfer Operation", amount, senderNumber, receiverNumber));
        }
    }
    public void WithDrawal(int AccNumber,double amount){
        Boolean exist = false;
        Account Acc = null;
        for ( Account account : accounts) {
            if (AccNumber == account.getNumber()) {
                Acc = account;     
                exist = true;  
            }
        }
        if (!exist) {
            System.out.println("Account Number Is Not Valid");
            return;
        }
        boolean operation = Acc.WithDrawal(amount);
        if (operation) {
            transactions.add(new Transaction("Withdrawl", "Successfuly Withdrawl Message", amount, AccNumber, null));
        }
    }
    public void Deposite(int AccNumber,double amount){
        Boolean exist = false;
        Account Acc = null;
        for ( Account account : accounts) {
            if (AccNumber == account.getNumber()) {
                Acc = account;       
                exist = true;
            }
        }
        if (!exist) {
            System.out.println("Account Number Is Not Valid");
            return;
        }
        boolean operation = Acc.Deposite(amount);
        if (operation) {
            transactions.add(new Transaction("Deposite", "Successfuly Deposite Message", amount, AccNumber, null));
        }

    }
    public void DisplayAllTransactions()
    {
        for (Transaction transaction : transactions ) {
            transaction.DisplayTransaction();
            System.out.println("");
        }
    }
    public void DisplayAllTransactionForOneAccount(int AccNumber)
    {
        for (Transaction transaction : transactions ) {
            if(transaction.getSenderAccountNumber() == AccNumber || transaction.getReciverAccountNumber() == AccNumber){
                transaction.DisplayTransaction();
                System.out.println("");
            }
        }
    }
    public void DisplayTransactionByID (int Id)
    {
        for (Transaction transaction : transactions ) {
            if(transaction.getTransactionId() == Id){
                transaction.DisplayTransaction();
                break;
            }
        }
    }
}
