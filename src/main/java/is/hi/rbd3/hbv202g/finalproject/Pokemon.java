package is.hi.rbd3.hbv202g.finalproject;


abstract class Pokemon implements Observer {

    private String name;

    private int life;


    public Pokemon(String name, int life) {
        this.name = name;
        this.life = life;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getLife() {
        return this.life;
    }

    public abstract int closeAttack();

    public abstract int specialAttack();

    public abstract int farAttack();

}
