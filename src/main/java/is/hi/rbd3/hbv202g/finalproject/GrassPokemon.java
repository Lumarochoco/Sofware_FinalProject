package is.hi.rbd3.hbv202g.finalproject;

public class GrassPokemon extends Pokemon {

    /**
     * Creates a new GrassPokemon
     * @param name
     * @param life
     */
    public GrassPokemon(String name, int life) {
        super(name, life);
    }
    /**
     * Define the number of damage for the pokemon's close attack.
     * @return the number of damage (int)
     */
    @Override
    public int closeAttack() {
        return 27;
    }

    /**
     * Define the number of damage for the pokemon's special attack.
     * @return the number of damage (int)
     */
    @Override
    public int specialAttack() {
        return 55;
    }

    /**
     * Define the number of damage for the pokemon's far attack.
     * @return the number of damage (int)
     */
    @Override
    public int farAttack() {
        return 8;
    }

    /**
     * Writes in the terminal the name and the life of the pokemon.
     */
    @Override
    public void update() {
        System.out.println("Your Pokemon "+this.getName()+" has " + getLife() + " HP left !");
    }
}
