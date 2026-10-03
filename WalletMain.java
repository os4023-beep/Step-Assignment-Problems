class MessWallet {
    private double balance;

    MessWallet(double b) {
        balance = b < 0 ? 0 : b;
    }

    void topUp(double a) {
        if (a <= 0)
            System.out.println("Top-up rejected");
        else
            balance += a;
    }

    void deduct(double a) {
        if (a > balance)
            System.out.println("Deduct rejected: insufficient balance");
        else
            balance -= a;
    }

    double getBalance() {
        return balance;
    }
}

public class WalletMain {
    public static void main(String[] args) {
        MessWallet w = new MessWallet(500);

        w.topUp(200);
        System.out.println("Balance after top-up: " + w.getBalance());

        w.deduct(1000);

        System.out.println("Final balance: " + w.getBalance());
    }
}