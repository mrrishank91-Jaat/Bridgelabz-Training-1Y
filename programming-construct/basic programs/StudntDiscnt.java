import java.util.Scanner;

public class StudntDiscnt{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	float fee = input.nextFloat();
	float discntPer = input.nextFloat();
	
	float discnt = (fee*discntPer)/100;
	
	float finalFee = fee-discnt;
	
	System.out.println("The discount amount is INR" +discnt +"and final discounted fee is INR " +finalFee);
	}

}