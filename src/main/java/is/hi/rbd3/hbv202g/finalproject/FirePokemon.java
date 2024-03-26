package is.hi.rbd3.hbv202g.finalproject;

public class FirePokemon extends Pokemon {

    public FirePokemon(String name, int life) {
        super(name, life);
    }
    @Override
    public int closeAttack() {
        return 15;
    }

    @Override
    public int specialAttack() {
        return 40;
    }

    @Override
    public int farAttack() {
        return 35;
    }

    @Override
    public void update() {
        System.out.println("Your Pokemon "+this.getName()+" has " + getLife() + " HP left !");
    }
}
