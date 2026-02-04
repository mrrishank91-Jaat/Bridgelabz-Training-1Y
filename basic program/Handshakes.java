import java.util.Scanner;
	public class Handshakes{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
			int students = input.nextInt();
			int handshks = (students*(students - 1))/2;
			
			System.out.println("The Number Of possible handshakes is " +handshks);
		}
	}