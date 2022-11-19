package ThreadBank;

public class Main {
    public static void main(String[] args) {
        final Bank bank = new Bank();
        Thread1 th1 = new Thread1(bank);
        Thread2 th2 = new Thread2(bank);
        th1.start();
        th2.start();

    }
}
