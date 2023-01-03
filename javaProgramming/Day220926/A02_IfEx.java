package Day220926;

public class A02_IfEx {
    public static void main(String[] args) {
        int score = 93;
        if(score>=90){
            System.out.println("점수가 90점 이상입니다.");
            System.out.println("등급은 A 입니다.");
        }
        else{           // else 의 경우 조건식 추가하지 x
            System.out.println("점수가 90보다 작습니다.");
            System.out.println(("등급은 B 입니다."));
        }
        //if 문과 else문 연관됨
    }
    
}
