package Day220926;

public class A05_forEx {
    public static void main(String[] args) {
        int sum=0;
        int i=0; // 밖에 선언하면 main함수 안 변수
        for (i=1;i<=100;i++)// 안에 있으면 지역변수
        {
            sum+=i;
        }

        System.out.println("i = "+i);
    }
    
}
