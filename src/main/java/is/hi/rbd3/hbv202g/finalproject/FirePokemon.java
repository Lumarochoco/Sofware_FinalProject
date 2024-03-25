package is.hi.rbd3.hbv202g.finalproject;

public class FirePokemon extends Pokemon {

    public FirePokemon(String name, int life) {
        super(name, life);
    }
    @Override
    public int closeAttack() {
        System.out.println("I'm attacking with my fire close attack, you lose 30 points of life");
        return -15;
    }

    @Override
    public int specialAttack() {
        System.out.println("I'm attacking with my fire special attack, you lose 50 points of life");
        return -40;
    }

    @Override
    public int farAttack() {
        System.out.println("I'm attacking with my fire far attack, you lose 10 points of life");
        return -35;
    }

    @Override
    public void update() {
        System.out.println("Your Pokemon "+this.getName()+" has " + getLife() + " HP left !");
    }
}
