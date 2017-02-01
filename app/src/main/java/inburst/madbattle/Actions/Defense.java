package inburst.madbattle.Actions;

import inburst.madbattle.Globals.Config;
import inburst.madbattle.Models.Player.Player;

/**
 * Created by lennyhicks on 1/31/17.
 * MadBattle.
 */

public class Defense {

    public static Integer defendPlayer(Player attackingPlayer, Player defendingPlayer){
        Integer total = 0;
            if(defendingPlayer.getPlayerStats().getDefense() > attackingPlayer.getPlayerStats().getAttack()){
                Integer advantage = defendingPlayer.getPlayerStats().getDefense() - attackingPlayer.getPlayerStats().getAttack();
                total = (int) (Math.random() * advantage / Config.DEFENDING_DIVIDER);
            }
        return total;
    }
}
