package com.sslab.pokemon;

import com.sslab.pokemon.guicomponent.PokemonLabel;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by jerry on 2017/3/26.
 */
public class GameThread implements Runnable {
    ArrayList<PokemonLabel> pokemons;
        public GameThread(ArrayList<PokemonLabel> pokemonLabels){
            pokemons = pokemonLabels;
            //TODO create and start the thread
            Thread thread = new Thread(this);
            thread.start();
        }

        @Override
        public void run() {
            while(true) {
                //TODO Update the pokemonLabels
                //TODO use Thread.sleep to make the loop go slower
                try{Thread.sleep(3000);}
                catch (InterruptedException e) {}
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        pokemons.get(0).Update();
                        pokemons.get(1).Update();
                        pokemons.get(2).Update();
                        pokemons.get(3).Update();
                        pokemons.get(4).Update();
                    }
                });
            }//while
        }//run
}
