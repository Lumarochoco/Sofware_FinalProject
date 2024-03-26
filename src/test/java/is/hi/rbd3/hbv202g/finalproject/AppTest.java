package is.hi.rbd3.hbv202g.finalproject;

import static is.hi.rbd3.hbv202g.finalproject.App.creationPokemon;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void pokemonIsWater(){
        WaterPokemon pokemon = new WaterPokemon("Tiplouf",100);
        assertEquals(pokemon.getClass(),creationPokemon("Tiplouf", 0).getClass());
    }

    @Test
    public void pokemonIsFire(){
        FirePokemon pokemon = new FirePokemon("Flambino",100);
        assertEquals(pokemon.getClass(),creationPokemon("Flambino", 1).getClass());
    }

    @Test
    public void pokemonIsGrass(){
        GrassPokemon pokemon = new GrassPokemon("Boustiflor",100);
        assertEquals(pokemon.getClass(),creationPokemon("Boustiflor", 2).getClass());
    }

}

