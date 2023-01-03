package Day221130;

/* 라이언& 모니카 문제
 * 남여가 객체 하나 공동 사용 초기 자원 50
 * 조건: 객체가 이용시 -가 나오면 안됨 
 * 문제: 객체 하나가 자원 이용, 자원 10이용
 * 상황: 남 스레드가 - 10만큼 자원을 쓰려고 함 (실행상태)
 *                  - 인터럽트 발생 (실행)-> (대기)상태로 전환
 *       여 스레드가 - 자원 50 이용하려고 함
 *                  - 여 스레드는 주아진 실행 시간동안 수행 완료 (종료 상태로 전환) -> 자원 0
 *       남 스레드 재시작 -> 인터럽트 해결 -> 실행상태로 전환 -> 자원 10이용 함
 *                       
 *                          => 자원(객체)이 -10 이 됨 
 */

class bankaccount{
    private int balance = 500000;

    public void withdraw(int amount){
        this.balance-=amount;
    }

    public int getBalance() {
        return this.balance;
    }
}

class RNM implements Runnable{
    bankaccount account = new bankaccount(); // bankaccount 생성, 참조
    @Override
    public void run() { //스레드 작업
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {

            if(account.getBalance()<0){
                System.out.println("잔고부족!");
            }
            makewithdrawal(100000); // 10만 인출 함수
        }
    }
    public synchronized void makewithdrawal(int amount) { // synchronized -> 동시에 진행 불가능하게 하는 key word 동시에 접근 불가능
        if(account.getBalance()>=amount){
            System.out.println(Thread.currentThread().getName()+"의 잔고확인"); // 현재 스레드애서 현재 스레드 이름 출력
            account.withdraw(amount);
            // try {
            //     Thread.sleep(1000);
            // } catch (Exception e) {
            //     e.printStackTrace();// TODO: handle exception
            // }  문제 해결 불가
            System.out.println(Thread.currentThread().getName()+"가 10만원 인출");
            System.out.println("\n 남아있는 잔액은" + account.getBalance()+"원 입니다");
        }
        else{
            System.out.println(Thread.currentThread().getName()+"님 잔고가 부족합니다");
        }
    }
}

public class concC {
    public static void main(String[] args) {
        // Thread    : 코드 -> 수행하는 객체
        // Runnable : 수행할 코드내부
        RNM job = new RNM(); // runable
        Thread ryan = new Thread(job);
        Thread monica = new Thread(job);
        
        ryan.setName("ryan");
        monica.setName("monica");

        ryan.start();
        monica.start();
    }
}


//출력 - 운영체체 스케줄러 맘대로