import java.util.Scanner;

public class Operators{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		System.out.println("vel:- " +a);
		a++;
		System.out.println("vel a:- " + a++);
		System.out.println("vel b:- " + a);
		++a; 
		System.out.println("vel c:- " + a++);
		System.out.println("vel d:- " + a++ );
		
		// For Loops
			for ( int i = 0; i <10; i++){
				System.out.println("i: " + +i);
			}
		// while loops 
			int j = 10;
			while (j>0){
				System.out.println("j: " +j);
			j--;
			}
		// Do-While loops 
			int k = 10;
			do {
				System.out.println("k: " +k);
			k--;
			} while(k>0);
	}
}