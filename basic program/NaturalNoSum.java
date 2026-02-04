import java.util.Scanner;

public class NaturalNoSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		if (a>0){
			int sum = a*(a+1)/2;
			System.out.println("Sum of " + a +" natural numbers" + sum);
		} else {
			System.out.println("Not a natural number");
		}
	}
}