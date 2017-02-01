package inburst.madbattle.Tools;

/**
 * Created by lennyhicks on 1/31/17.
 * MadBattle.
 */

public class Utils {

    public static Integer getRandom(int min, int max)
    {
        return (int) (Math.random()*(max-min))+min;
    }

    public static Integer getMultiplier(Integer total, Double multi){
        return (int)Math.round(total * multi);
    }
}
