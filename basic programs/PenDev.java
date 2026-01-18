public class PenDev{
    public static void main(String[] args) {
        int pens = 14;
        int stdnts = 3;

        int pensPerStdnt = pens/stdnts;
        int remainingPens = pens % stdnts;

        System.out.println("The Pen per student is " + pensPerStdnt +" and the remaining pen not distributed is " + remainingPens);
    }
}
