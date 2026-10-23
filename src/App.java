import java.util.*;
public class App {
    static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        Bank bank = new Bank();
        boolean running = true;
 
        while (running) {
            printMenu();
            int choice = readInt("Choose an option: ");
 
            switch (choice) {
                case 1:
                    scanner.nextLine(); 
                    System.out.print("Holder Name: ");
                    String name = scanner.nextLine();
                    double balance = readDouble("Initial Balance: ");
                    bank.AddAccountToBank(name, balance);
                    break;
                case 2:
                    bank.DisplayAllAccounts();
                    break;
                case 3:
                    bank.RetrieveAccount(readInt("Account Number: "));
                    break;
                case 4:
                    bank.DeleteAccount(readInt("Account Number: "));
                    break;
                case 5:
                    int depAcc = readInt("Account Number: ");
                    double depAmount = readDouble("Amount: ");
                    bank.Deposite(depAcc, depAmount);
                    break;
                case 6:
                    int witAcc = readInt("Account Number: ");
                    double witAmount = readDouble("Amount: ");
                    bank.WithDrawal(witAcc, witAmount);
                    break;
                case 7:
                    int from = readInt("Sender Account Number: ");
                    int to = readInt("Receiver Account Number: ");
                    double trAmount = readDouble("Amount: ");
                    if (from == to) {
                        System.out.println("Cannot transfer to the same account");
                    } else {
                        bank.TransferMoney(from, to, trAmount);
                    }
                    break;
                case 8:
                    bank.DisplayAllTransactions();
                    break;
                case 9:
                    bank.DisplayAllTransactionForOneAccount(readInt("Account Number: "));
                    break;
                case 10:
                    bank.DisplayTransactionByID(readInt("Transaction Id: "));
                    break;
                case 0:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
        scanner.close();
    }
 
    static void printMenu() {
        System.out.println("\n========== BANK MENU ==========");
        System.out.println("1  - Add Account");
        System.out.println("2  - Display All Accounts");
        System.out.println("3  - Retrieve Account");
        System.out.println("4  - Delete Account");
        System.out.println("5  - Deposit");
        System.out.println("6  - Withdraw");
        System.out.println("7  - Transfer Money");
        System.out.println("8  - Display All Transactions");
        System.out.println("9  - Display Transactions For One Account");
        System.out.println("10 - Display Transaction By Id");
        System.out.println("0  - Exit");
        System.out.println("===============================");
    }
 
    static int readInt(String message) {
        while (true) {
            System.out.print(message);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid whole number.");
                scanner.nextLine();
            }
        }
    }
 
    static double readDouble(String message) {
        while (true) {
            System.out.print(message);
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                scanner.nextLine();
            }
        }
    }

}
