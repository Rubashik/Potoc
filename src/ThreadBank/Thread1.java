package ThreadBank;

public class Thread1 extends Thread{
    Bank bank;

    Thread1(Bank ban){
        this.bank=ban;
    }
    public void run(){
        bank.inc();
    }
}
