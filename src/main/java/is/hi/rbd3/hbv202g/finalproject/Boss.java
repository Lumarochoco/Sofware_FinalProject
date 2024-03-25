package is.hi.rbd3.hbv202g.finalproject;

public class Boss extends Pokemon{
    public Boss(String name, int life) {
        super(name, life);
    }

    @Override
    public void update() {
        System.out.println("The boss "+this.getName()+" has " + getLife() + " HP left !");
    }

    @Override
    public int closeAttack() {
        return 0;
    }

    @Override
    public int specialAttack() {
        return 0;
    }

    @Override
    public int farAttack() {
        return 0;
    }
}
