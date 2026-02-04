import java.util.Scanner;
public class TotalPrice{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		float uP = input.nextFloat();
		int quantity = input.nextInt();
		
		double totalPrice = uP*quantity;
		
		System.out.println("The total purchase price is INR" +totalPrice +"if the quantity" +quantity+ "and unit price is INR" +uP);
	}
}