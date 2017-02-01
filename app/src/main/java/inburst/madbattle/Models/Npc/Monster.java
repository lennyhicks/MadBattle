package inburst.madbattle.Models.Npc;

/**
 * Created by lennyhicks on 1/31/17.
 * MadBattle.
 */

public class Monster {
    private String monsterName;
    private String monsterImage;
    private Integer monsterLevel;
    private Integer monsterAttack;
    private Integer monsterStrength;
    private Integer monsterDefense;
    private Integer monsterHealth;
    private Integer monsterCurrHealth;


    public Monster(String monsterName, String monsterImage, Integer monsterLevel, Integer monsterAttack, Integer monsterStrength, Integer monsterDefense, Integer monsterHealth) {
        this.monsterName = monsterName;
        this.monsterImage = monsterImage;
        this.monsterLevel = monsterLevel;
        this.monsterAttack = monsterAttack;
        this.monsterStrength = monsterStrength;
        this.monsterDefense = monsterDefense;
        this.monsterHealth = monsterHealth;
    }


    public String getMonsterName() {
        if(monsterName == null){
            return "No Name Set";
        }
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        if(monsterName == null){
            monsterName = "Invalid Name";
        }
        this.monsterName = monsterName;
    }

    public Integer getMonsterLevel() {
        if(monsterLevel == null){
            return 1;
        }
        return monsterLevel;
    }

    public void setMonsterLevel(Integer monsterLevel) {
        if(monsterLevel == null){
            monsterLevel = 1;
        }
        this.monsterLevel = monsterLevel;
    }

    public Integer getMonsterAttack() {
        if(monsterAttack == null){
            return 1;
        }
        return monsterAttack;
    }

    public void setMonsterAttack(Integer monsterAttack) {
        if(monsterAttack == null){
            monsterAttack = 1;
        }
        this.monsterAttack = monsterAttack;
    }

    public Integer getMonsterStrength() {
        if(monsterStrength == null){
            return 1;
        }
        return monsterStrength;
    }

    public void setMonsterStrength(Integer monsterStrength) {
        if(monsterStrength == null){
            monsterStrength = 1;
        }
        this.monsterStrength = monsterStrength;
    }

    public Integer getMonsterDefense() {
        if(monsterDefense == null){
            return 1;
        }
        return monsterDefense;
    }

    public void setMonsterDefense(Integer monsterDefense) {
        if(monsterDefense == null){
            monsterDefense = 1;
        }
        this.monsterDefense = monsterDefense;
    }

    public Integer getMonsterHealth() {
        if(monsterHealth == null){
            return 1;
        }
        return monsterHealth;
    }

    public void setMonsterHealth(Integer monsterHealth) {
        if(monsterHealth == null){
            monsterHealth = 1;
        }
        this.monsterHealth = monsterHealth;
    }

    public Integer getMonsterCurrHealth() {
        if(monsterCurrHealth == null){
            monsterCurrHealth = getMonsterHealth() * 10;
        }
        return monsterCurrHealth;
    }

    public void setMonsterCurrHealth(Integer monsterCurrHealth) {
        if(monsterCurrHealth == null){
            monsterCurrHealth = getMonsterHealth() * 10;
        }
        this.monsterCurrHealth = monsterCurrHealth;
    }

    public String getMonsterImage() {
        if(monsterImage == null){
            return "";
        }
        return monsterImage;
    }

    public void setMonsterImage(String monsterImage) {
        if(monsterImage == null){
            monsterImage = "";
        }
        this.monsterImage = monsterImage;
    }
}
