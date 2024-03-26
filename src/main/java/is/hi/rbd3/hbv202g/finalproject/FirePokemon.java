package is.hi.rbd3.hbv202g.finalproject;

public class FirePokemon extends Pokemon {

    /**
     * Creates a new FirePokemon
     * @param name
     * @param life
     */
    public FirePokemon(String name, int life) {

        super(name, life);
    }

    /**
     * Define the number of damage for the pokemon's close attack.
     * @return the number of damage (int)
     */
    @Override
    public int closeAttack() {
        return 15;
    }

    /**
     * Define the number of damage for the pokemon's special attack.
     * @return the number of damage (int)
     */
    @Override
    public int specialAttack() {
        return 40;
    }

    /**
     * Define the number of damage for the pokemon's far attack.
     * @return the number of damage (int)
     */
    @Override
    public int farAttack() {
        return 35;
    }

    /**
     * Writes in the terminal the name and the life of the pokemon.
     */
    @Override
    public void update() {
        System.out.println("Your Pokemon "+this.getName()+" has " + getLife() + " HP left !");
    }
}
