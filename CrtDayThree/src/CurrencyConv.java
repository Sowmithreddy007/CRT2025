import java.util.Scanner;

public class CurrencyConv {

	static float Conv(String ch, int a) {
		 
		 if(ch.equalsIgnoreCase("USA")){
				 return (a * 83.46f);
		 }else return 0.0f;
		
	}
	public static void main(String[] args) {
	   
		int x;
		String ch;

		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the value");
		ch=sc.next();
		Scanner sc1 = new Scanner(System.in);
	    System.out.println("Enter the value");
		x = sc.nextInt();
		
		Conv(ch,x);
		
		
	
	}

}
