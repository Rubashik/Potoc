package ThreadBank;

import static ThreadBank.BankConstants.MAX_VALUE;
import static ThreadBank.BankConstants.MIN_VALUE;

public class IncrementThread implements Runnable {
    private final Bank bank;

    public IncrementThread(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        synchronized (bank) {
            for (int i = MIN_VALUE; i < MAX_VALUE; i++) {
                bank.setAccount(bank.getAccount() + 2);
            }
            System.out.println("Increment thread: " + bank.getAccount());
        }
    }
}
