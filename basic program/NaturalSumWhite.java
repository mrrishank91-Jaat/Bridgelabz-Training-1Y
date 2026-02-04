import java.util.Scanner;

public class NaturalSumWhite{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

        if (n > 0) {
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            int f = n * (n + 1)/2;
            System.out.println("While Sum = " + sum);
            System.out.println("Formula Sum = " + f);
        } else {
            System.out.println("Not a natural numbber");
        }
    }
}
