import java.util.Scanner;

public class TotalPurchase{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
			float uP = sc.nextFloat();
			int quantity = sc.nextInt();
			
			float total = uP*quantity;
			
			System.out.println("The Total Purchase Price is INR " + total + "If the quantity" + quantity + "and price is INR" +uP);
	}
}