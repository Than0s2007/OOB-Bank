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

            switch (choice) {
                case 1:
                    System.out.print("Enter holder name: ");
                    String name = sc.next();
                    System.out.print("Enter balance: ");
                    double balance = sc.nextDouble();
                    bank.AddAccountToBank(name, balance);
                    break;

                case 2:
                    bank.DisplayAllAccounts();
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    int retrieveNum = sc.nextInt();
                    bank.RetrieveAccount(retrieveNum);
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    int deleteNum = sc.nextInt();
                    bank.DeleteAccount(deleteNum);
                    break;

                case 5:
                    System.out.print("Enter account number: ");
                    int depositNum = sc.nextInt();
                    System.out.print("Enter amount: ");
                    double depositAmount = sc.nextDouble();
                    bank.Deposite(depositNum, depositAmount);
                    break;

                case 6:
                    System.out.print("Enter account number: ");
                    int withdrawNum = sc.nextInt();
                    System.out.print("Enter amount: ");
                    double withdrawAmount = sc.nextDouble();
                    bank.WithDrawal(withdrawNum, withdrawAmount);
                    break;

                case 7:
                    System.out.print("Enter sender account number: ");
                    int sender = sc.nextInt();
                    System.out.print("Enter receiver account number: ");
                    int receiver = sc.nextInt();
                    System.out.print("Enter amount: ");
                    double transferAmount = sc.nextDouble();
                    bank.TransferMoney(sender, receiver, transferAmount);
                    break;

                case 8:
                    bank.DisplayAllTransactions();
                    break;

                case 9:
                    System.out.print("Enter account number: ");
                    int accNum = sc.nextInt();
                    bank.DisplayAllTransactionForOneAccount(accNum);
                    break;

                case 10:
                    System.out.print("Enter transaction id: ");
                    int id = sc.nextInt();
                    bank.DisplayTransactionByID(id);
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Wrong choice, try again");
            }

        } while (choice != 0);

        sc.close();
    }
}
