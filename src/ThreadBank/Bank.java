package ThreadBank;

public class Bank {
    private int account=2;

    public synchronized void inc(){
        for(;account<20000;account++){
            System.out.println("inc:"+account);
        }
    }
    public synchronized void dec(){
        for(;account>1;account--){
            System.out.println("dec:"+account);
        }
    }
    public void setAccount(int id){
        this.account=id;
    }
}
