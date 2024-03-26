package is.hi.rbd3.hbv202g.finalproject;

public class WaterPokemon extends Pokemon {

    public WaterPokemon(String name, int life) {
        super(name, life);
    }

    @Override
    public int closeAttack() {
        return 10;

    }

    @Override
    public int specialAttack() {
        return 50;
    }

    @Override
    public int farAttack() {
        return 30;

    }

    @Override
    public void update() {
        System.out.println("Your Pokemon "+this.getName()+" has " + getLife() + " HP left !");
    }
}
