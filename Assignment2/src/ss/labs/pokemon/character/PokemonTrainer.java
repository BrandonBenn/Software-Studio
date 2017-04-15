package ss.labs.pokemon.character;

import ss.labs.pokemon.PokemonData;
import java.util.*;
import javax.lang.model.type.PrimitiveType;

/**
 * Created by jerry on 2017/3/7.
 */
public class PokemonTrainer extends NPC{
    protected PokemonData pokemonData;

    //TODO solve the error
    public PokemonTrainer(String name, String job, String quote, PokemonData data)
    {
        //TODO call super constructor
        super(name, job, quote);
        //TODO assign attributes
        this.pokemonData = data;
    }

    public void showInformation(){
        super.showInformation();
        System.out.println(pokemonData.getId());
        System.out.println(pokemonData.getName());
        System.out.println(pokemonData.getType());
        System.out.println(pokemonData.getMove());
        System.out.println(pokemonData.getMaxHP());
        System.out.println(pokemonData.getCurrentHP());
        System.out.println(pokemonData.getAttack());
        System.out.println(pokemonData.getSpeed());
    }

    //TODO override toString()
    public String toString(){
        return name+job+quote;
    }
}
