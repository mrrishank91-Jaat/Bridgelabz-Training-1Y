import java.util.Scanner;

public class AreaOfTriangle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		float baseInInch = input.nextFloat();
		float heightInInch = input.nextFloat();
		
		double areaInInch = 0.5*baseInInch*heightInInch;
		
		double baseInCm = baseInInch*2.54;
		double heightInCm = heightInInch*2.54;
		
		double areaInCm = 0.5*baseInCm*heightInCm;
		
		System.out.println("Area of triangle in square inches is " +areaInInch);
		System.out.println("Area of triangle in square cm is " +areaInCm);
	}
}