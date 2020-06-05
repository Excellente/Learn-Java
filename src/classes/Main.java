package classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputMismatchException, IllegalArgumentException {
        Scanner sc = new Scanner(System.in);
        ChequeAccount cq = new ChequeAccount(643823647, 127, 0, "Mnumzame", "Mumbe", "Cheque Account");

        System.out.println("================== Welcome to Bank Zero ===============");
        System.out.println("Please select from the options below and press enter:");
        System.out.println("0. Check Balances");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Exit");

        boolean p = true;
        while (p) {
            try {

                double amnt;
                int cmmnd = sc.nextInt();

                if (cmmnd == 3) {
                    System.out.println("Thank you for banking with Bank Zero, please call again.");
                    break;
                }
                switch (cmmnd) {
                    case 0:
                        System.out.println("Current Balance: R " + cq.checkBalance());
                        break;
                    case 1:
                        System.out.print("Please enter deposit amount: R ");
                        amnt = sc.nextDouble();
                        cq.deposit(amnt);
                        System.out.println("Deposited R " + amnt);
                        break;
                    case 2:
                        System.out.print("Please enter withdrawal amount: R ");
                        amnt = sc.nextInt();
                        cq.withdraw(amnt);
                        System.out.println("R " + amnt + " Withdrawn.");
                        break;
                    default:
                        System.out.println("Please enter valid input from the menu.");
                }
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Invalid input, please try again.");
            } catch (IllegalArgumentException e) {
                sc.nextLine();
                System.out.println(e.getMessage());
            }
        }
    }
}
