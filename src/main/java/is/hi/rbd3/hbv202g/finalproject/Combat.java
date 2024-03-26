package is.hi.rbd3.hbv202g.finalproject;

import java.lang.Math;
import java.util.Scanner;

/**
 * Methods related to manage the fight between two Pokemon.
 */

public class Combat extends Observable {

    private Pokemon playerPokemon;

    private Pokemon boss;

    private Scanner scanner;

    /**
     * Creates a new combat object.
     * @param playerPokemon
     * @param boss
     */
    public Combat (Pokemon playerPokemon, Pokemon boss){
        super();
        this.playerPokemon = playerPokemon;
        this.boss = boss;
        this.scanner = new Scanner(System.in);
        this.attach(this.playerPokemon);
        this.attach(this.boss);
    }


    /**
     * Runs the entire fight.
     */
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


    /**
     * Executes the play of the player by choosing an attack.
     * 1 = close attack
     * 2 = far attack
     * 3 = special attack
     */
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

    /**
     * Executes the play of the NPC.
     * NPC = Non-Player Caracter
     * A random number is created to select the attack of the boss
     */
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

    /**
     * Executes the close attack of the pokemon's player and notifies the observer.
     */
    public void playercloseAttack(){
        int damage = (int) Math.ceil(playerPokemon.closeAttack()*(Math.random() * 0.9 + 0.1));
        boss.setLife(boss.getLife()- damage);
        System.out.println("Provocated damage : "+damage);
        notifyObservers();
    }

    /**
     * Executes the far attack of the pokemon's player and notifies the observer.
     */
    public void playerfarAttack(){
        int damage = (int) Math.ceil(playerPokemon.farAttack()*(Math.random() * 0.9 + 0.1));
        boss.setLife(boss.getLife()- damage);
        System.out.println("Provocated damage : "+damage);
        notifyObservers();
    }

    /**
     * Executes the special attack of the pokemon's player and notifies the observer.
     */
    public void playerSpecialAttack(){
        boss.setLife(boss.getLife()- playerPokemon.specialAttack());
        System.out.println("Provocated damage : "+playerPokemon.specialAttack());
        notifyObservers();
    }

    /**
     * Executes the close attack of the boss and notofies the observer.
     */
    public void bosscloseAttack(){
        int damage = (int) Math.ceil(boss.closeAttack()*(Math.random() * 0.9 + 0.1));
        playerPokemon.setLife(playerPokemon.getLife()- damage);
        System.out.println("Provocated damage : "+damage);
        notifyObservers();
    }

    /**
     * Executes the far attack of the boss and notofies the observer.
     */
    public void bossfarAttack(){
        int damage = (int) Math.ceil(boss.farAttack()*(Math.random() * 0.9 + 0.1));
        playerPokemon.setLife(playerPokemon.getLife()- damage);
        System.out.println("Provocated damage : "+damage);
        notifyObservers();
    }

    /**
     * Executes the special attack of the boss and notifies the obsever.
     */
    public void bossSpecialAttack(){
        playerPokemon.setLife(playerPokemon.getLife()- boss.specialAttack());
        System.out.println("Provocated damage : "+boss.specialAttack());
        notifyObservers();
    }

    /**
     * Checks if the fight is over.
     * Over = false
     * @return a boolean variable
     */
    public boolean checkCombatOver(){
        if ((this.playerPokemon.getLife() <=0) || (this.boss.getLife()) <= 0 ){
            return false;
        }else{
            return true;
        }
    }

    /**
     * Writes into the terminal the winner's name.
     */
    public void combatOver(){
        System.out.println("The fight is over ! \n");
        System.out.println("The winner is " + getNameWinner()+ "!");
    }

    /**
     *Gives the name of the winner of the fight.
     * @return the name of the winner
     */
    public String getNameWinner(){
        if(this.playerPokemon.getLife() <=0){
            return boss.getName();
        }else {
            return playerPokemon.getName();
        }
    }

    /**
     * Returns the pokemon's player.
     * @return the pokemon's player
     */
    public Pokemon getPlayerPokemon() {
        return playerPokemon;
    }

    /**
     * Sets the pokemon of the player.
     * @param playerPokemon
     */
    public void setPlayerPokemon(Pokemon playerPokemon) {
        this.playerPokemon = playerPokemon;
    }

    /**
     * Returns the boss.
     * @return the boss pokemon
     */
    public Pokemon getBoss() {
        return boss;
    }

    /**
     * Sets the boss pokemon.
     * @param boss
     */
    public void setBoss(Pokemon boss) {
        this.boss = boss;
    }

    /**
     * Returns the scanner.
     * @return scanner
     */
    public Scanner getScanner() {
        return scanner;
    }

    /**
     * Sets the scanner.
     * @param scanner
     */
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}

