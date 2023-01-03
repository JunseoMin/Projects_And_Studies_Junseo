public class A07_inde {
    public static void main(String[] args){
        int x=1;
        int y=1;

        //x=x+1;
        //x++;//x=x+1과 동일 
        //++x;//x=x+1과 동일

        int q=0; int p=0;
        q=x++ + 2;//다른 연산 진행 후 x값 1 증가 **후이 연산자
        p=++y + 2;//전이 연산자 x값 증가 후 다른 연산 진행**전이연산자
        System.out.println(q);
        System.out.println(p);
    }
    
}
