import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int x,r,y=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		x=sc.nextInt();
		
		for(int i=1;i<=x;i++) {
			r=x%i;
			if(r==0)y++;
			
		}
		
		if(y==2)System.out.println("This given number is a prime number");
		else System.out.println("This given number is a composite number");
		
	}

}
