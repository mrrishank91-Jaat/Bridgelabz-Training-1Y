package Logistics;

public class RestCheckpoint extends CheckPoint{
    public RestCheckpoint(Stinrg id, String loc, double dis, int exp, int acc) {
        super(id, loc, dis, exp, acc)
    }

    @Override
    public boolean isCritical(){
        return false;
    }
    @Override
    public String getType(){
        return "Rest Checkpoint";
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
