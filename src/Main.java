import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Bank.printMenu();
            System.out.print("Please select : ");
            int number = scanner.nextInt();
            switch (number) {
                case 1 -> Customer.addAccount();
                case 4 -> Bank.totalDeposit();
                case 5 -> System.exit(0);
                case 3 -> Customer.SendMoney();
                case 2 -> Customer.AddDepozit();
            }
        }

    }
}