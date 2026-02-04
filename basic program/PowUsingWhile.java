import java.util.Scanner;

public class PowUsingWhile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pow = sc.nextInt();

        int res = 1;
        int count = 0;

        while (count < pow){
            res = res * n;
            count++;
        }

        System.out.println("Result = " + res);
    }
}
