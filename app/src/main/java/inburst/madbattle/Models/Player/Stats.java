package inburst.madbattle.Models.Player;

import inburst.madbattle.Globals.Config;

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
    private Integer[] mExpLevels = new Integer[]{};

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

    public Integer[] getExpLevels() {
        return mExpLevels;
    }

    /**
     * This is how to add exp to a certain skill
     * @param skill is pulled from Globals Config
     * @param exp is the amount of exp you would like to add
     */
    public void addExp(Integer skill, Integer exp) {
        mExpLevels[skill] += (exp * Config.EXP_BASE_LEVEL * Config.EXP_MULTIPLIER);
        if(mExpLevels[skill] > 200000000){
            mExpLevels[skill] = 200000000;
        }
    }

    public void setCurrHealth(Integer currHealth){
        this.currHealth = currHealth;
    }
}
