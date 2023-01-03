package Day220928;

public class A06_Array {
    public static void main(String[] args) {
        //객체배열 배열 안에 객체가 있는 경우
        //for(int i=temp:배열명){}

        int[] tary={1,2,3,4,5};

        for (int temp : tary) { // tary에서 인덱스 0~마지막 인덱스까지 반복,
                                // 배열의 값이 순차적으로 한번 반복할떄마다 temp변수에 저장
                                // 배열의 값이 temp에 들어감 temp=tary[0], temp=tary[1] etc...
            System.out.println(temp);
        }
    }
    
}
