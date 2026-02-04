import java.util.*;

public class SumUntilZero{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		double sum = 0, num;
		
		while(true){
			num = sc.nextDouble();
			if (num == 0){
				
			sum += num;
			break;
			}
			System.out.println("Sum =" + sum);
		}
	}
}   