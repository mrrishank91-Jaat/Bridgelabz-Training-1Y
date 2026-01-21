import java.util.Scanner;
public class SquareSide1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
		float pm = sc.nextFloat();
		float side = pm / 4;
			
		System.out.println("The length of the side is " +side + "whose perimeter is " + pm);
	}
}