package inburst.madbattle.Actions;

import inburst.madbattle.Models.Player.Player;

/**
 * Created by lennyhicks on 1/31/17.
 * MadBattle.
 */

public class Attack {

    public Integer attackPlayer(Player currentPlayer, Player opposingPlayer){
        Integer total = 0;
        if(currentPlayer.getPlayerStats().getAttack() >= opposingPlayer.getPlayerStats().getDefense()){

        } else {

        }
        return total;
    }
}
