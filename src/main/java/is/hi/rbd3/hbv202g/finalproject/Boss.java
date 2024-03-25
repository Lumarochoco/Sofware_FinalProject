package is.hi.rbd3.hbv202g.finalproject;

public class Boss extends Pokemon{
    public Boss(String name, int life) {
        super(name, life);
    }

    @Override
    public void update(int damage) {

    }

    @Override
    public int closeAttack() {
        System.out.println("I'm attacking with my boss close attack, you lose 10 points of life");
        return -25;
    }

    @Override
    public int specialAttack() {

        System.out.println("I'm attacking with my boss special attack, you lose 45 points of life");
        return -45;
    }

    @Override
    public int farAttack() {

        System.out.println("I'm attacking with my boss far attack, you lose 10 points of life");
        return -20;
    }
}
