import java.util.Scanner;

public class MathRound {

	public static void main(String[] args) {
	 
		float x;
		int y=0,a=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		x=sc.nextFloat();
		
		x=y;
		x=x*10;
		a=(int) (x%10);
		if(x>5) {
			x=y+1;
		}else if(x<=5) {
			x=y;
		}
		System.out.println("The value is :\t"+x);
	}

}
