package ThreadBank;

public class Thread2 extends Thread{
    Bank bank;

    Thread2(Bank ban){
        this.bank=ban;
    }

    public void run(){
        bank.dec();
    }
}
