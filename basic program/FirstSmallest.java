import java.util.Scanner;

public class FirstSmallest{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a<b && a<c){
			System.out.println("First Number is smallest");
		} else {
			System.out.println("First Number is not  smallest");
		}
	}
}

		