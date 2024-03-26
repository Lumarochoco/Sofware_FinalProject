package is.hi.rbd3.hbv202g.finalproject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Methods related to test methodes used to manage the fight between two Pokemon.
 */
public class CombatTest {

    private final int life = 100;

    private Pokemon pokemon;
    private Pokemon boss;

    private Combat combat;

    /**
     * Creates two Pokemon and a combat object.
     */
    @Before
    public void creationPokemonAndCombat(){
        this.pokemon = new WaterPokemon("Morice", this.life);
        this.boss = new Boss("Mammochon", life);

        this.combat = new Combat(this.pokemon, this.boss);
    }

    /**
     * Tests if the combat is over when the player wins.
     */
    @Test
    public void combatIsOverPlayerWins(){
        this.boss.setLife(-10);
        assertFalse(this.combat.checkCombatOver());
    }

    /**
     * Tests if the combat is over when the boss wins.
     */
    @Test
    public void combatIsOverBossWins(){
        this.pokemon.setLife(0);
        assertFalse(this.combat.checkCombatOver());
    }

    /**
     * Tests if we get the name of the winner when the player wins.
     */
    @Test
    public void playerWins(){
        this.pokemon.setLife(89);
        this.boss.setLife(-25);

        assertEquals(this.pokemon.getName(),this.combat.getNameWinner());
    }

    /**
     * Tests if we get the name of the winner when the boss wins.
     */
    @Test
    public void bossWins(){
        this.pokemon.setLife(0);
        this.boss.setLife(25);

        assertEquals(this.boss.getName(),this.combat.getNameWinner());
    }

    /**
     * Tests to verify that the combat is not over.
     */
    @Test
    public void combatNotOver(){
        this.pokemon.setLife(50);
        this.boss.setLife(89);

        assertTrue(this.combat.checkCombatOver());
    }

    /**
     * Tests the special attack of the boss.
     */
    @Test
    public void bossSpecialAttack(){
        this.pokemon.setLife(life);
        this.combat.bossSpecialAttack();

        assertEquals(55,this.pokemon.getLife());
    }



}
