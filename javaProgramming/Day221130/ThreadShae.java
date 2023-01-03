package Day221130;

import java.util.Random;

class Balance{
    private int count=0;
    public void setinc() {
        this.count++;
    }
    public void dec() {
        this.count--;
    }
    public int getC() {
        return this.count;
    }
}
class threadrun extends Thread{
    Balance balance;
    public threadrun(Balance balance){
        this.balance = balance;
    }

    @Override
    public void run() {
        int i = 0;
        // TODO Auto-generated method stub
        while (i<20000) {
            this.balance.setinc();
            this.balance.dec();
            if (i%40==0) {
                System.out.println(balance.getC());
            }
            try {
                Thread.sleep((int)Math.random()*2);
            } catch (Exception e) {
                e.printStackTrace();// TODO: handle exception
            }
            i++;
        }
    }
}

public class ThreadShae {
    public static void main(String[] args) {
        Balance balance = new Balance();

        (new threadrun(balance)).start();
        (new threadrun(balance)).start();
        (new threadrun(balance)).start();
        (new threadrun(balance)).start();


    }
}

// 스레드의 수행순서, 모니카 참조 0이 안나오는 이유??