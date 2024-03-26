package is.hi.rbd3.hbv202g.finalproject;

public class WaterPokemon extends Pokemon {

    /**
     * Creates a new WaterPokemon
     * @param name
     * @param life
     */
    public WaterPokemon(String name, int life) {
        super(name, life);
    }

    /**
     * Define the number of damage for the pokemon's close attack.
     * @return the number of damage (int)
     */
    @Override
    public int closeAttack() {
        return 10;

    }

    /**
     * Define the number of damage for the pokemon's special attack.
     * @return the number of damage (int)
     */
    @Override
    public int specialAttack() {
        return 50;
    }

    /**
     * Define the number of damage for the pokemon's far attack.
     * @return the number of damage (int)
     */
    @Override
    public int farAttack() {
        return 30;

    }

    /**
     * Writes in the terminal the name and the life of the pokemon.
     */
    @Override
    public void update() {
        System.out.println("Your Pokemon "+this.getName()+" has " + getLife() + " HP left !");
    }
}
