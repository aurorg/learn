package src.main.java.src.java2;

/**
 * 银行账户存钱问题
 *
 */
class Account{
    private double balance;//余额

    //构造器
    public Account(double balance){
        this.balance =balance;
    }

    //存钱的方法
    public synchronized void deposit(double amt){
        if(amt>0){
            balance +=amt;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()
                    +":存钱成功。余额是：" + balance);
        }
    }
}

class Customer extends Thread{
    private Account acct;

    public Customer(Account acct){
        this.acct=acct;  //让两个用户共用同一个账户
    }

    @Override
    public void run() {
        for(int i=0;i<3;i++){
            acct.deposit(1000);
        }
    }

}

public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account(0);//两个线程公用同一个账户

        Customer c1 = new Customer(acct);
        Customer c2 = new Customer(acct);

        c1.setName("甲");
        c2.setName("乙");

        c1.start();
        c2.start();

    }
}
