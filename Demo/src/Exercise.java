import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		char ch,z,y;
		do{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the char");
		ch = sc.next().charAt(0); 
		if ((ch>='A')&&(ch<='Z')) {
			System.out.println("The given char is an uppercase alphabet");
		}else if((ch>='a')&&(ch<='z')) {
			System.out.println("The given char is an lowercase alphabet");
		}
		System.out.println("Want to Convert the alphabet's case? If yes type y or else type n");
 	    Scanner sc1 = new Scanner(System.in);
        y = sc1.next().charAt(0);
		if(y =='y') {
			if((ch>='A')&&(ch<='Z')) {
				ch= (char)(ch+32);
				System.out.println("The aplhabet after conversion is :"+ch);
			}
			else if((ch>='a')&&(ch<='z')) {
				ch= (char)(ch-32);
			       System.out.println("The aplhabet after conversion is :"+ch);
			}
			else System.out.println("invalid input"); 
		}
		System.out.println("Want to repeat ? The type y else type n");
		Scanner sc21= new Scanner(System.in);
		z = sc21.next().charAt(0);
		}while( z =='y');
	}
}
