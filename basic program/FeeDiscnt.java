public class FeeDiscnt{
	public static void main(String[] args){
	float fee = 125000;
	float disPercnt = 10;
	float discnt = (fee*disPercnt)/100;
	float finalFee = fee-discnt;

	System.out.println("The discount amount is INR" + discnt+ "and Final discounted fee is INR" + finalFee);
	}
}