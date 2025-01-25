import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		
		String name1;
		String name2;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st string");
		name1 = sc.next();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the 2nd string");
		name2 = sc1.next();
		
		name2 = name2+name1;
		name1=name2.substring(0,name2.length()-name1.length());
		name2=name2.substring(name1.length());
		
		System.out.println("name1--->"+name1);
		System.out.println("name2--->"+name2);


		

	}

}
