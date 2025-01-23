import java.util.Scanner;

public class PrimeFunction {
	
	
	static int primeInBetween(int a, int b) {
		int c=0,i=0;
		for ( i=a;i<=b;i++) {
			
		   for(int k=1;k>=i;k++) {
			   if(k%i==0) {
				   c++;
			   }if(c==2) {
				   System.out.println(i);
			   }
		   }
		}
		return 0;
		
	}
	

	public static void main(String[] args) {
		
		int x,y;
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the range");
		x = sc.nextInt();
		y = sc1.nextInt();
		primeInBetween(x,y);
 
	}

}
