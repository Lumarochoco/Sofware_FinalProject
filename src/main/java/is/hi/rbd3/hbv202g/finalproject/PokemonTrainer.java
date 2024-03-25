package is.hi.rbd3.hbv202g.finalproject;

public class PokemonTrainer {

    private String name;

    private Pokemon pokemon;

    public PokemonTrainer (String name, Pokemon pokemon){
        this.name = name;
        this.pokemon = pokemon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}
