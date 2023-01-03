package Day220919;

public class A08_if06 {
    public static void main(String[] args) {
        int a=10,b=10,c=5;

        if(a==b){
            if(b==c){
                System.out.println("a와 c는 같다.");
            }else{
                System.out.println("a와c는 다르다");
            }
        }else{
            System.out.println("a와 b는 다르다");
        }

        if(a==b&&b==c){
            System.out.println("a와 c는 같다.");
        }else{
            System.out.println("a와 c는 다르다.");
        }
    
    }
}
/// if문 사용시 3level넘어간다면 코드 잘못 작성한것, 다시 작성하기.
