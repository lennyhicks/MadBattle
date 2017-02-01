package inburst.madbattle.Admin;

import android.util.Log;

import java.util.Random;

import inburst.madbattle.Models.Item.Item;
import inburst.madbattle.Tools.Utils;

/**
 * Created by lennyhicks on 1/31/17.
 * MadBattle.
 */

public class ItemEditor {
    private Item mItem;

    public ItemEditor(Item item) {
        this.mItem = item;
    }

    private Item rerollItem(Double[] multiplier) {
        Integer total = mItem.getItemStats().getTotal()
                + mItem.getItemBonusStats().getTotal();

        //// TODO: 1/31/17 Need to figure out the proper formula to return four random ints that equal up to the total.
        // Min and Max multipliers are in the Config;
        Integer min = Utils.getMultiplier(total, multiplier[0]);
        Integer max = Utils.getMultiplier(total, multiplier[1]);

        Utils.getRandom(min, max);
        return mItem;
    }


    public static double[] rerollItem(int n, double total, double min, double max) {
        Random rand = new Random();
        double randNums[] = new double[n];
        randNums[0] = min + (max - min) * rand.nextDouble();

        double[] test = randSum(n - 1, total - randNums[0]);
        System.arraycopy(test, 0, randNums, 1, test.length);

        double totals = 0;
        for(double tests : randNums){
            totals += tests;
            Log.i("Rolls", tests + "");
        }

        Log.i("total", totals + "");

        return randNums;
    }

    private static double[] randSum(int n, double m) {
        Random rand = new Random();
        double randNums[] = new double[n], sum = 0;


        for (int i = 0; i < randNums.length; i++) {
            randNums[i] = rand.nextDouble();
            sum += randNums[i];
        }

        for (int i = 0; i < randNums.length; i++) {
            randNums[i] /= sum / m;
        }
        return randNums;
    }

}
