package Logistics;

public class FuelCheckPoint extends CheckPoint{
    public FuelCheckPoint(String id, String loc, double dis, int exp, int acc) {
        super(id, loc, dis, exp, acc)
    }

    @Override
    public boolean isCritical(){
        return false;
    }
    @Override
    public String getType(){
        return "Delivery Checkpoint";
    }

    @Override
    public double Penalty(){
        if(!delayedcheck)(){
            return 0;
        }
        else {
            return 10;
        }
    }
}
