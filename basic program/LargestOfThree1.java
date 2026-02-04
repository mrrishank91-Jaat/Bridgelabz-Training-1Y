import java.util.Scanner;

public class LargestOfThree1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a>b && a>c){
			System.out.println("First Number is largest");
		} else if (b>a && b>c){		
			System.out.println("Second Number is largest");
		} else {
			System.out.println("Third Number is largest");
		}
	}
}
