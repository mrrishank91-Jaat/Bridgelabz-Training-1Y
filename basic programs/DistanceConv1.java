import java.util.Scanner;

public class DistanceConv1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		float feet = sc.nextFloat();
		float yards = feet/3;
		float miles = yards / 1760;
		
		System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
	}
}