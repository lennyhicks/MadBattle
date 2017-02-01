package inburst.madbattle.Globals;

/**
 * Created by lennyhicks on 1/31/17.
 * MadBattle.
 */

public class Config {

    /**
     * Global server multipliers
     */

    public static Integer EXP_BASE_LEVEL = 4;
    public static Integer EXP_MULTIPLIER = 1;
    public static Integer DROP_MULTIPLIER = 1;

    /**
     * Setting up the Skills array to easily add exp to each.
     */
    public static Integer ATTACK_LEVEL = 0;
    public static Integer DEFENSE_LEVEL = 1;
    public static Integer STRENGTH_LEVEL = 2;
    public static Integer HEALTH_LEVEL = 3;


    public static Double ITEM_ROLL_MIN_BASIC = .15;
    public static Double ITEM_ROLL_MAX_BASIC = .35;

    public static Double ITEM_ROLL_MIN_ADVANCED = .25;
    public static Double ITEM_ROLL_MAX_ADVANCED = .45;

    public static Double ITEM_ROLL_MIN_SUPERIOR = .35;
    public static Double ITEM_ROLL_MAX_SUPERIOR = .55;

    public static Double ITEM_ROLL_MIN_MASTER = .45;
    public static Double ITEM_ROLL_MAX_MASTER = .65;

    public static Integer DEFENDING_DIVIDER = 5;

    //if total were 10
    //int firstRoll = total * first roll; if roll .65, firstRoll = 6.5.
    //total = total - firstRoll = 3.5.
    //second roll !> 1/3(total) * 3.5
    //total = total - second roll
    // third roll !> 1/3 * 3.5
    //fourth roll is remainder




}
