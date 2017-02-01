package inburst.madbattle.Models.Item;

/**
 * Created by lennyhicks on 1/31/17.
 * MadBattle.
 */

public class ItemBonusStats {
    private Integer itemLuck = 0;
    private Integer itemExp = 0;
    private Integer itemGoldDrop = 0;
    private Integer itemHealth = 0;


    private ItemBonusStats(Integer itemLuck, Integer itemExp, Integer itemGoldDrop, Integer itemHealth) {
        this.itemLuck = itemLuck;
        this.itemExp = itemExp;
        this.itemGoldDrop = itemGoldDrop;
        this.itemHealth = itemHealth;
    }

    public static class Builder {
        private Integer itemLuck = 0;
        private Integer itemExp = 0;
        private Integer itemGoldDrop = 0;
        private Integer itemHealth = 0;

        public Builder() {
            itemLuck = 0;
            itemExp = 0;
            itemGoldDrop = 0;
            itemHealth = 0;
        }

        public Builder(Integer itemLuck, Integer itemExp, Integer itemGoldDrop, Integer itemHealth) {
            this.itemLuck = itemLuck;
            this.itemExp = itemExp;
            this.itemGoldDrop = itemGoldDrop;
            this.itemHealth = itemHealth;
        }

        public Builder(ItemBonusStats itemStats) {
            this.itemLuck = itemStats.getItemLuck();
            this.itemExp = itemStats.getTtemExp();
            this.itemGoldDrop = itemStats.getItemGoldDrop();
            this.itemHealth = itemStats.getItemHealth();
        }

        public Builder changeitemLuck(Integer itemLuck) {
            this.itemLuck = itemLuck;
            return this;
        }

        public Builder changeitemExp(Integer itemExp) {
            this.itemExp = itemExp;
            return this;
        }

        public Builder changeitemGoldDrop(Integer itemGoldDrop) {
            this.itemGoldDrop = itemGoldDrop;
            return this;
        }

        private Builder changeitemHealth(Integer itemHealth) {
            this.itemHealth = itemHealth;
            return this;
        }

        public ItemBonusStats build() {
            return new ItemBonusStats(itemLuck, itemExp, itemGoldDrop, itemHealth);
        }
    }

    public Integer getItemLuck() {
        return itemLuck;
    }

    public Integer getTtemExp() {
        return itemExp;
    }

    public Integer getItemGoldDrop() {
        return itemGoldDrop;
    }

    public Integer getItemHealth() {
        return itemHealth;
    }

    public Integer getTotal(){
        return itemExp + itemGoldDrop + itemHealth + itemLuck;
    }
}
