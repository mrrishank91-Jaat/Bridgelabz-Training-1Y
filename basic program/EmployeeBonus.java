import java.util.Scanner;

class EmployeeBonus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double slry = sc.nextDouble();
        int years = sc.nextInt();

        if(years>5){
            double bonus = slry*0.05;
            System.out.println("Bonus = " + bonus);
        } else {
            System.out.println("No Bonus");
        }
    }
}