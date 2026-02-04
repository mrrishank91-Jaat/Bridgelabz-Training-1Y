import java.util.Scanner;

public class HeightConv{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		float heightCm = input.nextFloat();
		double inches = heightCm/2.54;
		int feet = (int) (inches / 12);
		double remInches = inches % 12; 
		
		System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + "and inches is" +remInches);
	}
}