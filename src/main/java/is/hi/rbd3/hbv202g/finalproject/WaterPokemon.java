package is.hi.rbd3.hbv202g.finalproject;

public class WaterPokemon extends Pokemon {

    public WaterPokemon(String name, int life) {
        super(name, life);
    }

    @Override
    public int closeAttack() {
        System.out.println("I'm attacking with my water close attack, you lose 10 points of life");
        return -10;

    }

    @Override
    public int specialAttack() {
        System.out.println("I'm attacking with my water special attack, you lose 50 points of life");
        return -50;
    }

    @Override
    public int farAttack() {
        System.out.println("I'm attacking with my water far attack, you lose 30 points of life");
        return -30;

    }

    @Override
    public void update() {
        System.out.println("Your Pokemon "+this.getName()+" has " + getLife() + " HP left !");
    }
}
