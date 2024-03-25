package is.hi.rbd3.hbv202g.finalproject;

import java.lang.Math;

public class Combat extends Observable {

    private Pokemon playerPokemon;

    private Pokemon boss;

    public Combat (Pokemon playerPokemon, Pokemon boss){
        this.playerPokemon = playerPokemon;
        this.boss = boss;
    }

    public void playercloseAttack(){
        boss.setLife(boss.getLife()- (int) Math.ceil(playerPokemon.closeAttack()*Math.random()));
    }

    public void playerfarAttack(){
        boss.setLife(boss.getLife()- (int) Math.ceil(playerPokemon.farAttack()*Math.random()));
    }

    public void playerSpecialAttack(){
        boss.setLife(boss.getLife()- (int) Math.ceil(playerPokemon.specialAttack()*Math.random()));
    }

    public void bosscloseAttack(){
        playerPokemon.setLife(playerPokemon.getLife()- (int) Math.ceil(boss.closeAttack()*Math.random()));
    }

    public void bossfarAttack(){
        playerPokemon.setLife(playerPokemon.getLife()- (int) Math.ceil(boss.farAttack()*Math.random()));
    }

    public void bossSpecialAttack(){
        playerPokemon.setLife(playerPokemon.getLife()- (int) Math.ceil(boss.specialAttack()*Math.random()));
    }


    public Pokemon getPlayerPokemon() {
        return playerPokemon;
    }

    public void setPlayerPokemon(Pokemon playerPokemon) {
        this.playerPokemon = playerPokemon;
    }

    public Pokemon getBoss() {
        return boss;
    }

    public void setBoss(Pokemon boss) {
        this.boss = boss;
    }
}
