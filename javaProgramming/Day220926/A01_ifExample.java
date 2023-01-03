package Day220926;

public class A01_ifExample {
    public static void main(String[] args) {
        int score = 93;
        if(score>=90){
            System.out.println("점수가 90점 이상입니다.");
            System.out.println("등급은 A 입니다.");
        }
        if(score<90){
            System.out.println("점수가 90보다 작습니다.");
            System.out.println(("등급은 B 입니다."));
        }
        /// 위의 if문과 밑의 if문은 서로 영향 x

        
    }
    
}
