package inburst.madbattle.Admin;

import inburst.madbattle.Models.Item.Item;
import inburst.madbattle.Tools.Utils;

/**
 * Created by lennyhicks on 1/31/17.
 * MadBattle.
 */

public class ItemEditor {
    private Item mItem;

    public ItemEditor(Item item){
        this.mItem = item;
    }

    private Item rerollItem(Double[] multiplier){
        Integer total = mItem.getItemStats().getTotal()
                        + mItem.getItemBonusStats().getTotal();

        //// TODO: 1/31/17 Need to figure out the proper formula to return four random ints that equal up to the total.
        // Min and Max multipliers are in the Config;
        Integer min = Utils.getMultiplier(total, multiplier[0]);
        Integer max = Utils.getMultiplier(total, multiplier[1]);

        Utils.getRandom(min, max);
        return mItem;
    }

}
