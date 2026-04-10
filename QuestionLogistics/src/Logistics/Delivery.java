package Logistics;

public class Delivery extends CheckPoint{
    public Delivery(String id, String loc, double dis, int exp, int acc){
        super(id, loc, dis, exp, acc);
    }

    @Override
    public boolean isCrictical() {
        return false;
    }

    @Override
    public String getType(){
        return "Delivery Checkpoint";
    }

    @Override
    public double Penalty(){
        if(!delayedcheck(){
            return 0;
        }
        else {
            return (actual_time - expected_time) + 2;
        }
    }
}
