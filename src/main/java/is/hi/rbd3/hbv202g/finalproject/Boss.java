package is.hi.rbd3.hbv202g.finalproject;

public class Boss extends Pokemon{

    /**
     * Creates a new Boss Pokemon
     * @param name
     * @param life
     */
    public Boss(String name, int life) {
        super(name, life);
    }

    /**
     * Writes in the terminal the name and the life of the boss.
     */
    @Override
    public void update() {
        System.out.println("The boss "+this.getName()+" has " + getLife() + " HP left !");
    }

    /**
     * Define the number of damage for the boss' close attack.
     * @return the number of damage (int)
     */
    @Override
    public int closeAttack() {
        return 25;
    }

    /**
     * Define the number of damage for the boss' special attack.
     * @return the number of damage (int)
     */
    @Override
    public int specialAttack() {
        return 45;
    }

    /**
     * Define the number of damage for the boss' far attack.
     * @return the number of damage (int)
     */
    @Override
    public int farAttack() {
        return 20;
    }
}
