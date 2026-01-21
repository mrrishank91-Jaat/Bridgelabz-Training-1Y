import  java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		float num1 = input.nextFloat();
		float num2 = input.nextFlaot();
		System.out.println("Addition=" +(num1 + num2));
		System.out.println("Subtraction=" +(num1 - num2));
		System.out.println("Multiplication=" +(num1 * num2));
		System.out.println("Division=" +(num1 / num2));
	}
}