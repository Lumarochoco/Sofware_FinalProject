package is.hi.rbd3.hbv202g.finalproject;

import java.lang.Math;
import java.util.Scanner;

public class Combat extends Observable {

    private Pokemon playerPokemon;

    private Pokemon boss;

    private Scanner scanner;

    public Combat (Pokemon playerPokemon, Pokemon boss){
        super();
        this.playerPokemon = playerPokemon;
        this.boss = boss;
        this.scanner = new Scanner(System.in);
        this.attach(this.playerPokemon);
        this.attach(this.boss);
    }

    public void match(){
        System.out.printf("-------------------------------------\n");
        System.out.println("Let's start the fight ! ");
        System.out.printf("-------------------------------------\n");

        Boolean run = true;

        while(run){
            playerTurn();
            run = checkCombatOver();
            if (!run){
                break;
            }
            npcTurn();
            run = checkCombatOver();
        }

        combatOver();
    }

    public void playerTurn(){
        System.out.println("It's your turn ! \n");
        System.out.printf("Choose an attack ! \n");

        System.out.println("Close Attack = 1");
        System.out.println("Far Attack = 2");
        System.out.println("Special Attack = 3");

        int attack = this.scanner.nextInt();

        switch (attack){
            case 1 :
                System.out.println("Close attack selected");
                playercloseAttack();
                break;
            case 2 :
                System.out.println("Far attack selected");
                playerfarAttack();
                break;
            case 3 :
                System.out.println("Special attack selected");
                playerSpecialAttack();
                break;
        }

        System.out.println("Your turn is over");
        System.out.println("---------------------------------");
    }

    public void npcTurn(){
        System.out.println("It's the NPC's turn ! \n");

        int attack = (int) (Math.random() * 3) + 1;

        switch (attack){
            case 1 :
                System.out.println("Close attack selected");
               bosscloseAttack();
                break;
            case 2 :
                System.out.println("Far attack selected");
                bossfarAttack();
                break;
            case 3 :
                System.out.println("Special attack selected");
                bossSpecialAttack();
                break;
        }

        System.out.println("NPC's turn is over");
        System.out.println("---------------------------------");
    }

    public void playercloseAttack(){
        int damage = (int) Math.ceil(playerPokemon.closeAttack()*(Math.random() * 0.9 + 0.1));
        boss.setLife(boss.getLife()- damage);
        System.out.println("Provocated damage : "+damage);
        notifyObservers();
    }

    public void playerfarAttack(){
        int damage = (int) Math.ceil(playerPokemon.farAttack()*(Math.random() * 0.9 + 0.1));
        boss.setLife(boss.getLife()- damage);
        System.out.println("Provocated damage : "+damage);
        notifyObservers();
    }

    public void playerSpecialAttack(){
        boss.setLife(boss.getLife()- playerPokemon.specialAttack());
        System.out.println("Provocated damage : "+playerPokemon.specialAttack());
        notifyObservers();
    }

    public void bosscloseAttack(){
        int damage = (int) Math.ceil(boss.closeAttack()*(Math.random() * 0.9 + 0.1));
        playerPokemon.setLife(playerPokemon.getLife()- damage);
        System.out.println("Provocated damage : "+damage);
        notifyObservers();
    }

    public void bossfarAttack(){
        int damage = (int) Math.ceil(boss.farAttack()*(Math.random() * 0.9 + 0.1));
        playerPokemon.setLife(playerPokemon.getLife()- damage);
        System.out.println("Provocated damage : "+damage);
        notifyObservers();
    }

    public void bossSpecialAttack(){
        playerPokemon.setLife(playerPokemon.getLife()- boss.specialAttack());
        System.out.println("Provocated damage : "+boss.specialAttack());
        notifyObservers();
    }

    public boolean checkCombatOver(){
        if ((this.playerPokemon.getLife() <=0) || (this.boss.getLife()) <= 0 ){
            return false;
        }else{
            return true;
        }
    }

    public void combatOver(){
        System.out.println("The fight is over ! \n");
        System.out.println("The winner is " + getNameWinner()+ "!");
    }


    public String getNameWinner(){
        if(this.playerPokemon.getLife() <=0){
            return boss.getName();
        }else {
            return playerPokemon.getName();
        }
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

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
