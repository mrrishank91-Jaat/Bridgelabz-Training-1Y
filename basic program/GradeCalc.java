import java.util.Scanner;

public class GradeCalc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double phy = sc.nextDouble();
        double chem = sc.nextDouble();
        double math = sc.nextDouble();

        double avg = (phy + chem + math)/3;

        System.out.println("Average = " + avg);

        if(avg >= 80){
			System.out.println("Grade A");
        } else if(avg >= 70){
			System.out.println("Grade B");
		} else if(avg >= 60){
			System.out.println("Grade C");
        } else if(avg >= 50){
			System.out.println("Grade D");
        } else if(avg >= 40){
			System.out.println("Grade E");
        } else {
			System.out.println("Grade R");
    }
}
}

