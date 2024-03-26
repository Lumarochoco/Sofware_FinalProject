package is.hi.rbd3.hbv202g.finalproject;

public class GrassPokemon extends Pokemon {

    public GrassPokemon(String name, int life) {
        super(name, life);
    }

    @Override
    public int closeAttack() {
        return 27;
    }

    @Override
    public int specialAttack() {
        return 55;
    }

    @Override
    public int farAttack() {
        return 8;
    }

    @Override
    public void update() {
        System.out.println("Your Pokemon "+this.getName()+" has " + getLife() + " HP left !");
    }
}
