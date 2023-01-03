package Day220928;

public class A04_array {
    public static void main(String[] args) {
        int[] ary=new int[100];

        for (int i = 0; i < ary.length; i++) {
            ary[i]=i+1;
        }

        int tot=0;

        for (int i = 0; i < ary.length; i++) {
            tot+=ary[i];
        }

        System.out.println(tot);
    }
    
}