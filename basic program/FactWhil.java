import java.util.Scanner;

class FactWhil{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n>0) {
            int fact = 1;
            while (n > 0) {
                fact *= n;
                n--;
            }
            System.out.println("Factrial = " + fact);
        } else {
            System.out.println("Entr positive number");
        }
    }
}
