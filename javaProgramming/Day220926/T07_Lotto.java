package Day220926;

import java.util.Random;

public class T07_Lotto {

	public static void main(String[] args) {

		int a,b,c,d,e,f;

		Random rand = new Random();

		

		for(int i=0; i<100; i++) {

			

			a = Math.abs(rand.nextInt() % 45) +1;			

			do {				

				b = Math.abs(rand.nextInt()%45) + 1;				

			}while(b==a);

			

			do {

				

				c = Math.abs(rand.nextInt()%45) + 1;

				

			}while(c==a || c==b);

			

			

			do {

				c = Math.abs(rand.nextInt()%45) + 1;

			}while(c==a || c==b);

			do {

				e = Math.abs(rand.nextInt()%45) + 1;

			}while(e==a || e==b || e==c);

			do {

				d = Math.abs(rand.nextInt()%45) + 1;

			}while(d==a || d==b || d==c || d==e);

			do {

				f = Math.abs(rand.nextInt()%45) + 1;

			}while(f==a || f==b || f==c || f==d || f==e);

			

			System.out.printf("%2d %2d %2d %2d %2d %2d\n", a,b,c,d,e,f);

		}

	}

}