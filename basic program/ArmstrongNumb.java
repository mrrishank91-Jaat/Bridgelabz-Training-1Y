import java.util.Scanner;

public class ArmstrongNumb{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = num;
        int sum = 0;

        while(a != 0){
            int digit = a % 10;
            sum += digit * digit * digit;
            a = a / 10;
        }

        if(sum == a)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
    }
}
