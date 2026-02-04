import java.util.Scanner;

public class KmToMilesUserInput{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		float km = input.nextFloat();
		double miles = km/1.6;
		
		System.out.println("The total miles is " +miles +" mile for the given" + km + "km");
	}
}