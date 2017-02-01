package inburst.madbattle.Actions;

import android.util.Log;

import inburst.madbattle.Globals.Config;
import inburst.madbattle.Models.Player.Player;

/**
 * Created by lennyhicks on 1/31/17.
 * MadBattle.
 */

public class Attack {

    public Attack(Player currentPlayer, Player opposingPlayer){

        Integer total = getAttack(currentPlayer, opposingPlayer);
        currentPlayer.addExp(Config.ATTACK_LEVEL, opposingPlayer.getPlayerStats().getDefense());
        currentPlayer.addExp(Config.STRENGTH_LEVEL, total);
        if(stillAlive(currentPlayer) && stillAlive(opposingPlayer)) {
            Integer damage = getAttack(opposingPlayer, currentPlayer);
            currentPlayer.damage(damage);
            currentPlayer.addExp(Config.DEFENSE_LEVEL, damage);
            new Attack(currentPlayer, opposingPlayer);
        }
    }

    private Boolean stillAlive(Player player){
        return player.getPlayerStats().getCurrHealth() >= 0;
    }

    private Integer getAttack(Player currentPlayer, Player opposingPlayer){
        Integer total;
        if(currentPlayer.getPlayerStats().getAttack() >= opposingPlayer.getPlayerStats().getDefense()){
            total = (int) (Math.random()*(currentPlayer.getPlayerStats().getStrength()/3) + 1);
        } else {
            Integer defense = Defense.defendPlayer(currentPlayer, opposingPlayer);
            total = (int) (Math.random()*currentPlayer.getPlayerStats().getStrength()/3) + 1 - defense;
        }
        if(total > 0) {
            opposingPlayer.damage(total);
            Log.i("Attack ", total.toString());
        } else {
            //// TODO: 1/31/17 add block message
            Log.i("Block", "block");
        }
        return total;
    }
}
