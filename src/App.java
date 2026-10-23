import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        int choice;

        do {
            System.out.println("\n====== Bank Menu ======");
            System.out.println("1 - Add Account");
            System.out.println("2 - Display All Accounts");
            System.out.println("3 - Retrieve Account");
            System.out.println("4 - Delete Account");
            System.out.println("5 - Deposit");
            System.out.println("6 - Withdraw");
            System.out.println("7 - Transfer Money");
            System.out.println("8 - Display All Transactions");
            System.out.println("9 - Display Transactions For One Account");
            System.out.println("10 - Display Transaction By Id");
            System.out.println("0 - Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter holder name: ");
                String name = sc.next();
                System.out.print("Enter balance: ");
                double balance = sc.nextDouble();
                bank.AddAccountToBank(name, balance);
            } else if (choice == 2) {
                bank.DisplayAllAccounts();
            } else if (choice == 3) {
                System.out.print("Enter account number: ");
                int num = sc.nextInt();
                bank.RetrieveAccount(num);
            } else if (choice == 4) {
                System.out.print("Enter account number: ");
                int num = sc.nextInt();
                bank.DeleteAccount(num);
            } else if (choice == 5) {
                System.out.print("Enter account number: ");
                int num = sc.nextInt();
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                bank.Deposite(num, amount);
            } else if (choice == 6) {
                System.out.print("Enter account number: ");
                int num = sc.nextInt();
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                bank.WithDrawal(num, amount);
            } else if (choice == 7) {
                System.out.print("Enter sender account number: ");
                int sender = sc.nextInt();
                System.out.print("Enter receiver account number: ");
                int receiver = sc.nextInt();
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                bank.TransferMoney(sender, receiver, amount);
            } else if (choice == 8) {
                bank.DisplayAllTransactions();
            } else if (choice == 9) {
                System.out.print("Enter account number: ");
                int num = sc.nextInt();
                bank.DisplayAllTransactionForOneAccount(num);
            } else if (choice == 10) {
                System.out.print("Enter transaction id: ");
                int id = sc.nextInt();
                bank.DisplayTransactionByID(id);
            } else if (choice == 0) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Wrong choice, try again");
            }

        } while (choice != 0);

        sc.close();
    }
}
