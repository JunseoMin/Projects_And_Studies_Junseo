package Day221128;
class myrunable implements Runnable{

    @Override
    public void run() {// 스레드가 수행햐애하는 작업
        // TODO Auto-generated method stub
        try {
            Thread.sleep(3000); //sec 스레드 작업이 오래 걸릴경우에는 메인 스레드부터 진행됨
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
        go();
    }
    public void go() {
        domore();
    }
    public void domore() {
        System.out.println("top of stack!!");
    }
}

public class Thred_test {
    public static void main(String[] args) {    // 스레드임
     myrunable rb = new myrunable(); // 스레드가 해야될 일(로직)   
     Thread t1 = new Thread(rb);    //작업을 하는 스레드
     t1.start();
     extracted();//sec
     System.out.println("back in the main");
  
    //스레드에 실행되는 
    }

    private static void extracted() throws InterruptedException {
        Thread.sleep(3000);
    }
}
