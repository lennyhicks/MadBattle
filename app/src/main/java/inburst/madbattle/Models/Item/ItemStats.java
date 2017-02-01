package inburst.madbattle.Models.Item;

/**
 * Created by lennyhicks on 1/28/17.
 * MadBattle.
 */

public class ItemStats {
    private Integer itemAttack = 0;
    private Integer itemDefense = 0;
    private Integer itemStrength = 0;
    private Integer itemStamina = 0;


    private ItemStats(Integer itemAttack, Integer itemDefense, Integer itemStrength, Integer itemStamina) {
        this.itemAttack = itemAttack;
        this.itemDefense = itemDefense;
        this.itemStrength = itemStrength;
        this.itemStamina = itemStamina;
    }

    public static class Builder {
        private Integer itemAttack = 0;
        private Integer itemDefense = 0;
        private Integer itemStrength = 0;
        private Integer itemStamina = 0;

        public Builder() {
            itemAttack = 0;
            itemDefense = 0;
            itemStrength = 0;
            itemStamina = 0;
        }

        public Builder(Integer itemAttack, Integer itemDefense, Integer itemStrength, Integer itemStamina) {
            this.itemAttack = itemAttack;
            this.itemDefense = itemDefense;
            this.itemStrength = itemStrength;
            this.itemStamina = itemStamina;
        }

        public Builder(ItemStats itemStats) {
            this.itemAttack = itemStats.getItemAttack();
            this.itemDefense = itemStats.getItemDefense();
            this.itemStrength = itemStats.getItemStrength();
            this.itemStamina = itemStats.getItemStamina();
        }

        public Builder changeItemAttack(Integer itemAttack) {
            this.itemAttack = itemAttack;
            return this;
        }

        public Builder changeItemDefense(Integer itemDefense) {
            this.itemDefense = itemDefense;
            return this;
        }

        public Builder changeItemStrength(Integer itemStrength) {
            this.itemStrength = itemStrength;
            return this;
        }

        private Builder changeItemStamina(Integer itemStamina) {
            this.itemStamina = itemStamina;
            return this;
        }

        public ItemStats build() {
            return new ItemStats(itemAttack, itemDefense, itemStrength, itemStamina);
        }
    }

    public Integer getItemAttack() {
        return itemAttack;
    }

    public Integer getItemDefense() {
        return itemDefense;
    }

    public Integer getItemStrength() {
        return itemStrength;
    }

    public Integer getItemStamina() {
        return itemStamina;
    }

    public Integer getTotal(){
        return itemAttack + itemStamina + itemStrength + itemDefense;
    }
}
