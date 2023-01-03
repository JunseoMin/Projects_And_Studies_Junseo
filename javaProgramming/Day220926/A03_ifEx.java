package Day220926;

public class A03_ifEx {
    public static void main(String[] args) {
        int score = 93;
        if(score>=90){
            System.out.println("점수가 90점 이상입니다.");
            System.out.println("등급은 A 입니다.");
        }
        else if(score>=80){
            System.out.println("점수가 80보다 작습니다.");
            System.out.println(("등급은 B 입니다."));
        }
        else if(score>=70){
            System.out.println("점수가 70점 이상입니다.");
            System.out.println("등급은 c 입니다.");
        }
        else{
            System.out.println("점수가 60보다 작습니다.");
            System.out.println(("등급은 d 입니다."));
        }
    }
    
}
