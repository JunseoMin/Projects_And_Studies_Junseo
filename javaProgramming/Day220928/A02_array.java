package Day220928;

public class A02_array {
    public static void main(String[] args) {
        int[] ary= {1,2,3,4,5,6,7,8,9,10};
         // 배열과 for문은 한쌍
        for(int i=0;i<10;i++)
        {
        System.out.println(ary[i]);
        }

        int c=0;
        while(c<10){
            System.out.println(ary[c]);
            c++;
        }
    }
    
}
