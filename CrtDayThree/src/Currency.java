import java.util.Scanner;

public class Currency {
	
	static void Conv(String a, int b) {
		float res=0.0f;
		if((a.contains("USA"))||(a.contains("usa"))) {
			res=b*78.65f;
		}
		System.out.println("The equivalent indian currency is : "+res);
	}
	public static void main(String[] args) {
		String x;
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		x=sc.next();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the amount");
		y=sc1.nextInt();
		Conv(x,y);
		
	}

}
