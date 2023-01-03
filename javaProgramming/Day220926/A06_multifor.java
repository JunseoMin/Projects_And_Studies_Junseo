package Day220926;

public class A06_multifor {
    public static void main(String[] args) 
    {
        for(int i=1;i<=9;i++)
        {
            for(int j=2;j<=9;j++)
            {
                System.out.printf("%d x %d = %2d  ",j,i,i*j);
            }
            System.out.println();
            //******************포인트는 세로출력!!!!!!!!!!!!!!****
        
        }
    }
    
}
