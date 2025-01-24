import java.util.Scanner;

public class PrimeFunction {
	
	
    static int primeInBetween(int a, int b) {
       int c=0;
       int i = 0;
    	for(int x=a;x<=b;x++) {
    		int num = x;
    	for(i=1;i<=num;i++) {
        	if(num%i==0){
        		c++;
        	}
    	}
    	}
    	if(c==2){
    		System.out.println();
    	}
		
    	
    	
    	return 0;
    	
    }
	 public static void main(String[] args) {
		
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		x=sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
        y=sc1.nextInt();
        primeInBetween(x,y);
        
        
}
	
	}
	

