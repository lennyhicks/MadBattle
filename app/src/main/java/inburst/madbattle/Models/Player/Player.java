package inburst.madbattle.Models.Player;

/**
 * Created by lennyhicks on 1/27/17.
 * MadBattle.
 */

public class Player {
    private String playerName;
    private Stats playerStats;
    private Inventory playerInventory;
    private Equipment playerEquips;

    private Player(String playerName, Stats playerStats, Inventory playerInventory, Equipment playerEquips){
        this.playerName = playerName;
        this.playerStats = playerStats;
        this.playerInventory = playerInventory;
        this.playerEquips = playerEquips;
    }

    public static class Builder{

        private String playerName;
        private Stats playerStats;
        private Inventory playerInventory;
        private Equipment playerEquips;

        public Builder(){
            this.playerName = "";
            this.playerStats = new Stats();
            this.playerInventory = new Inventory();
            this.playerEquips = new Equipment();
        }

        public Builder(String playerName, Stats playerStats, Inventory playerInventory, Equipment playerEquips) {
            this.playerName = playerName;
            this.playerStats = playerStats;
            this.playerInventory = playerInventory;
            this.playerEquips = playerEquips;
        }

        public Builder(Player player){
            this.playerName = player.getPlayerName();
            this.playerStats = player.getPlayerStats();
            this.playerInventory = player.getPlayerInventory();
            this.playerEquips = player.getPlayerEquips();
        }

        public Player build(){
            return new Player(playerName, playerStats, playerInventory, playerEquips);
        }
    }

    public String getPlayerName() {
        return playerName;
    }

    public Stats getPlayerStats() {
        return playerStats;
    }

    public Inventory getPlayerInventory() {
        return playerInventory;
    }

    public Equipment getPlayerEquips() {
        return playerEquips;
    }

    public void addExp(Integer skill, Integer total){
        getPlayerStats().addExp(skill, total);
    }

    public void damage(Integer damage){
        getPlayerStats().setCurrHealth(getPlayerStats().getCurrHealth() - damage);
    }
}
