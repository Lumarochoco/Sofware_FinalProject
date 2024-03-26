package is.hi.rbd3.hbv202g.finalproject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CombatTest {

    private final int life = 100;

    private Pokemon pokemon;
    private Pokemon boss;

    private Combat combat;

    @Before
    public void creationPokemonAndCombat(){
        this.pokemon = new WaterPokemon("Morice", this.life);
        this.boss = new Boss("Mammochon", life);

        this.combat = new Combat(this.pokemon, this.boss);
    }

    @Test
    public void combatIsOverPlayerWins(){
        this.boss.setLife(-10);
        assertFalse(this.combat.checkCombatOver());
    }

    @Test
    public void combatIsOverBossWins(){
        this.pokemon.setLife(0);
        assertFalse(this.combat.checkCombatOver());
    }

    @Test
    public void playerWins(){
        this.pokemon.setLife(89);
        this.boss.setLife(-25);

        assertEquals(this.pokemon.getName(),this.combat.getNameWinner());
    }

    @Test
    public void bossWins(){
        this.pokemon.setLife(0);
        this.boss.setLife(25);

        assertEquals(this.boss.getName(),this.combat.getNameWinner());
    }

    @Test
    public void combatNotOver(){
        this.pokemon.setLife(50);
        this.boss.setLife(89);

        assertTrue(this.combat.checkCombatOver());
    }


}
