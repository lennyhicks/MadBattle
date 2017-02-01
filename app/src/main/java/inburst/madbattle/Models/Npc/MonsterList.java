package inburst.madbattle.Models.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lennyhicks on 1/31/17.
 * MadBattle.
 */

public class MonsterList {
    public static List<Monster> monsters = new ArrayList<>();

    public static List<Monster> getMonsters() {
        return monsters;
    }

    public static void setMonsters(List<Monster> monsters) {
        MonsterList.monsters = monsters;
    }
}
