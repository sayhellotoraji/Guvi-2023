import java.util.Scanner;

interface Bank {

    double bank_operation(double amount, double balance);
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 0.0;
        System.out.println("Initial Balance: " + balance);

        System.out.println("Enter amount to deposit: ");
        double deposit_amount = Double.parseDouble(sc.nextLine());

        // Deposit
        Bank deposit = (amount, bal) -> bal = amount + bal;
        balance = deposit.bank_operation(deposit_amount, balance);
        System.out.println("Current Balance: " + balance);

        // Withdraw
        System.out.println("Enter amount to withdraw: ");
        double withdraw_amount = Double.parseDouble(sc.nextLine());

        Bank withdraw = (amount, bal) -> {
            if (bal < 0 || bal < amount) {
                try {
                    throw new Exception("Insufficient Funds: ");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                } 
            } 
            
            else
                return bal - amount;
            return bal;

        };

        balance = withdraw.bank_operation(withdraw_amount, balance);

        System.out.println("Current Balance: " + balance);

    }
}