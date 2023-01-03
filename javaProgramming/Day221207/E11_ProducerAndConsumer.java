package Day221207;
class Buffer {
    private int data;
    private boolean empty = true;
 
    public synchronized int get() { //소비자
       while (empty) {
          try {
             wait(); // 데이터가 없어 가져갈 수 없으니 조금만 기다려~ => 인터럽트
          } catch (InterruptedException e) {
             e.printStackTrace();
          }
       }
       empty = true;
       notifyAll();// 대기상태의 스레드에게 알림 > wait해제 
       return data;
    }
 
    public synchronized void put(int data) {//생산자
       while (!empty) {// 데이터가 있으니 조금만 기다려~! => 인터럽트 / 소비자가 소비 안하면 기다리기
          try {
             wait();
          } catch (InterruptedException e) {
             e.printStackTrace();
          }
       }
       empty = false;
       this.data = data; // 생산자가 만든 데이터
       notifyAll();
    }
 }
 
 class Producer implements Runnable {
    private Buffer buffer; // 공유 객체 참조 변수
 
    public Producer(Buffer buffer) {
       this.buffer = buffer;
    }
 
    @Override
    public void run() {
       for (int i = 0; i < 10; i++) {
          buffer.put(i);
          System.out.println("생산자: " + i + "번째 케익을 생산함");
 
          try {
             Thread.sleep((int) (Math.random() * 1000));
          } catch (InterruptedException e) {
             e.printStackTrace();
          }
       }
    }
 
 }
 
 class Consumer implements Runnable {
    private Buffer buffer; // 공유 객체 참조 변수
 
    public Consumer(Buffer buffer) {
       this.buffer = buffer;
    }
 
    @Override
    public void run() {
       for (int i = 0; i < 10; i++) {
          buffer.get();
          System.out.println("소비자: " + i + "번째 케익을 소비함");
 
          try {
             Thread.sleep((int) (Math.random() * 1000));
          } catch (InterruptedException e) {
             e.printStackTrace();
          }
       }
    }
 
 }
 
 public class E11_ProducerAndConsumer {
    public static void main(String[] args) {
       Buffer buf = new Buffer();
       Producer pd = new Producer(buf);
       Consumer cs = new Consumer(buf);
       
       Thread t1 = new Thread(pd);
       Thread t2 = new Thread(cs);
       
       t1.start();
       t2.start();
    }
 }