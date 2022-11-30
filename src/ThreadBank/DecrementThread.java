package ThreadBank;

import static ThreadBank.BankConstants.MAX_VALUE;
import static ThreadBank.BankConstants.MIN_VALUE;

public class DecrementThread implements Runnable {
    private final Bank bank;

    public DecrementThread(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        synchronized (bank) {
            for (int i = MIN_VALUE; i < MAX_VALUE; i++) {
                bank.setAccount(bank.getAccount() - 1);
            }
            System.out.println("Decrement thread: " + bank.getAccount());
        }
    }
}
