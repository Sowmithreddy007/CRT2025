import java.util.Scanner;

public class FunctionDemo {
	static void pattern(char ch,int c) {
		for(int i=1;i<=c;i++)
		System.out.print(ch);
		}
	public static void main(String[] args) {
	    char ch;
	    int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the char");
		ch=sc.next().charAt(0);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number");
		i=sc1.nextInt();
		pattern(ch,i);
	}
}
