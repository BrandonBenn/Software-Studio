package ss.labs.pokemon.character;

import ss.labs.pokemon.PokemonData;

import javax.lang.model.type.PrimitiveType;
/**
 * Created by jerry on 2017/3/7.
 */
public class PokemonTrainer extends NPC{
    protected PokemonData pokemonData;
    //TODO solve the error
    public PokemonTrainer(String name, String job, String quote, PokemonData data)
    {
        super(name,job,quote);
        this.pokemonData = data;
    }
    public void showInformation(){
       System.out.println("pokedata:");
       System.out.println("    id: "+pokemonData.getId());
       System.out.println("    name: "+pokemonData.getName());
       System.out.println("    type: "+pokemonData.getType());
       System.out.println("    move: "+pokemonData.getMove());
    }

    //TODO override toString()
    public String toString() {
        interact();
        showInformation();
        return " ";
    }

}
