import java.util.Scanner;

// 7.  Write the program to print the square of any number.



public class Question7 {
	
	

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.out.println("Enter the Number that you want to Square");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int result = num*num;
		
		System.out.println(" Your Number Square Root : " + result);
		

	}

}
