package com.sslab.pokemon.guicomponent;

import com.sslab.pokemon.PokemonSprite;

import javax.swing.*;
import java.util.Random;

import static com.sslab.pokemon.PokemonSprite.bushIcon;

/**
 * Created by jerry on 2017/3/26.
 */
public class PokemonLabel extends JLabel{
    private int pokemonID;
    public PokemonLabel()
    {
        setIcon(bushIcon());
    }
    public int getID(){
        return pokemonID;
    }

    public void Update() {
        //TODO setup a counter, if time up you may want to change to another state
        int random = (int)(Math.random()*2);
        if(random==0) popPokemon();
        else hidePokemon();
    }
    public void popPokemon(){
        //TODO when a pokemon pop up
        int id = (int)(Math.random()*5);
        switch (id){
            case 0: pokemonID = 0; break;
            case 1: pokemonID = 1; break;
            case 2: pokemonID = 2; break;
            case 3: pokemonID = 62; break;
            case 4: pokemonID = 64; break;
            default: return;
        }//switch statement
        setIcon(new ImageIcon(PokemonSprite.getSprite(pokemonID)));
        state = WhacPokemonState.Show;
    }

    public void hidePokemon() {
        //TODO when the pokemon hide into the bushes
        setIcon(PokemonSprite.bushIcon());
        state = WhacPokemonState.Hide;
    }

    public void caught() {
        //TODO when player caught the pokemon
        setIcon(PokemonSprite.pokeballIcon());
        state = WhacPokemonState.Caught;
    }

    public boolean isCatchable() {return state == WhacPokemonState.Show;}
    WhacPokemonState state = WhacPokemonState.Hide;
}
enum WhacPokemonState{Hide,Show,Caught}
