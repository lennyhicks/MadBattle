package inburst.madbattle.Models.Item;

/**
 * Created by lennyhicks on 1/28/17.
 * MadBattle.
 */

public class Item {
    private String itemName;
    private ItemStats mItemStats;

    private Item(String itemName, ItemStats itemStats){
        this.itemName = itemName;
        this.mItemStats = itemStats;
    }

    public static class Builder{
        private String itemName;
        private ItemStats mItemStats;

        public Builder(){
            this.itemName = "";
            this.mItemStats = new ItemStats.Builder().build();
        }

        public Builder(String itemName, ItemStats itemStats){
            this.itemName = itemName;
            this.mItemStats = itemStats;
        }

        public Builder(Item item){
            this.itemName = item.getItemName();
            this.mItemStats = item.getItemStats();
        }

        public Item build(){
            return new Item(itemName, mItemStats);
        }
    }

    public String getItemName() {
        if(itemName == null){
            return "";
        }
        return itemName;
    }

    public ItemStats getItemStats() {
        if(mItemStats == null){
            return new ItemStats.Builder().build();
        }
        return mItemStats;
    }
}
