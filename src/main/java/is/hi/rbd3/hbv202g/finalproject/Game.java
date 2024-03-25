package is.hi.rbd3.hbv202g.finalproject;

public class Game {

    private PokemonTrainer player;
    private PokemonTrainer npc; //Non-player Character

    public Game (PokemonTrainer player, PokemonTrainer npc){
        this.player = player;
        this.npc = npc;
    }

    public PokemonTrainer getPlayer() {
        return player;
    }

    public void setPlayer(PokemonTrainer player) {
        this.player = player;
    }

    public PokemonTrainer getNpc() {
        return npc;
    }

    public void setNpc(PokemonTrainer npc) {
        this.npc = npc;
    }
}
