import java.util.Scanner;

public class DistConv{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		float distInFeet = input.nextFloat();
		float yards = distInFeet/3;
		float miles = yards / 1760;
		
		System.out.println("Distance in Yards is" +yards);
		System.out.println("Distance in Miles is" +miles);
	}
}