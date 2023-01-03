package Day220926;

public class A04_ifEx {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6)+1; ///대문자 나올경우 임폴트 없이 사용 가능

        if(num==1){
            System.out.println("1번이 나왔습니다");
        }else if(num==2){
            System.out.println("2번이 나왔습니다");
        }else if(num==3){
            System.out.println("3번이 나왔습니다");
        }else if(num==4){
            System.out.println("4번이 나왔습니다");
        }else if(num==5){
            System.out.println("5번이 나왔습니다");
        }else{
            System.out.println("6번이 나왔습니다");
        }

    }
}
