package inburst.madbattle.Models.Player;

/**
 * Created by lennyhicks on 1/27/17.
 * MadBattle.
 */

public class Stats {
    private Integer level= 1;
    private Integer health = 10;
    private Integer currHealth = 10;
    private Integer attack = 1;
    private Integer strength = 1;
    private Integer defense = 1;

    public Integer getLevel() {
        return level;
    }

    public Integer getHealth() {
        return health;
    }

    public Integer getCurrHealth() {
        return currHealth;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getStrength() {
        return strength;
    }

    public Integer getDefense() {
        return defense;
    }
}
