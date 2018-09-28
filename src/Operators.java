import java.util.Scanner;
public class Operators {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		boolean b= false;
		
		System.out.println("Type a number between 1 and 10 or 20 and 30");
		a= sc.nextInt();
		
		if ((a>=1 && a<=10) || (a>=20 && a<=30)) {
			
			if (a%2!=0) {
				System.out.println("The number is odd");
			}
			
			else {
				System.out.println("The number is even");
			}
		
		}
		
		else {
		
		System.out.println("The number is incorrect");


	}
		// ! inverts the value of a boolean
		System.out.println(!b);
	}

}
