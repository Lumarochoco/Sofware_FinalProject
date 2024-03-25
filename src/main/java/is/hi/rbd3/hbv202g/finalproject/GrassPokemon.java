package is.hi.rbd3.hbv202g.finalproject;

public class GrassPokemon extends Pokemon {

    public GrassPokemon(String name, int life) {
        super(name, life);
    }

    @Override
    public int closeAttack() {
        System.out.println("I'm attacking with my grass close attack, you lose 20 points of life");
        return -27;
    }

    @Override
    public int specialAttack() {
        System.out.println("I'm attacking with my grass special attack, you lose 60 points of life");
        return -55;
    }

    @Override
    public int farAttack() {
        System.out.println("I'm attacking with my grass far attack, you lose 30 points of life");
        return -8;
    }

    @Override
    public void update() {
        System.out.println("Your Pokemon "+this.getName()+" has " + getLife() + " HP left !");
    }
}
