import java.util.Scanner;

public class VoteCheck{
	public static void main(String[] args){
			Scanner sc = new Scanner(System.out);
			
			int a = sc.nextInt();
			
		if (a>=18){
			System.out.println("Can Vote");
		} else {
			System.out.println("Cannot Vote");
		}
	}
}