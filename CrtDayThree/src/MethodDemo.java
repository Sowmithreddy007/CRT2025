import java.util.Scanner;

public class MethodDemo {
	
	static void pattern(char ch,char ch1, int c) {
		int j;
		for(int i=1;i<=c;i++) {
		System.out.println(ch);
		for(j=1;j++<=i;System.out.println(ch1));
		}
		}
	public static void main(String[] args) {
		char ch,ch1;
	    int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the char");
		ch=sc.next().charAt(0);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the char");
		ch1=sc1.next().charAt(0);
		Scanner sc2= new Scanner(System.in);
		System.out.println("Enter the number");
		i=sc2.nextInt();
		pattern(ch,ch1,i);	
	}

}
