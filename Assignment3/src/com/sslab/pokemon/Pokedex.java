package com.sslab.pokemon;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sslab.pokemon.data.PokemonSpeciesData;
import com.sslab.pokemon.data.PokemonValueData;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Pokedex {
    ArrayList<PokemonSpeciesData> pokemonSpeciesDataList = new ArrayList();
    public Pokedex()
    {}

    public Pokedex(String filename) {
        try {
            loadFile(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    void loadFile(String fileName) throws IOException {
        //use JsonReader to read json file
        JsonReader reader = new JsonReader(new FileReader(fileName));
        //create a gson object
        Gson gson = new Gson();
        //use gson to convert text to object
        PokemonSpeciesData[] dataArray = gson.fromJson(reader,PokemonSpeciesData[].class);
        //Convert array into arraylist
        pokemonSpeciesDataList = new ArrayList<>(Arrays.asList(dataArray));
        //close the reader to stop reading file
        reader.close();
    }
    void saveFile(String fileName) throws IOException {
        //TODO sort list before save to file
        //Create JsonWriter with fileName
        JsonWriter writer = new JsonWriter(new FileWriter(fileName));
        //create a gson object
        Gson gson = new Gson();
        //use gson to write object into json file, remember to convert ArrayList back to normal array first
        gson.toJson(pokemonSpeciesDataList.toArray(),PokemonSpeciesData[].class,writer);
        //close the writer, very important!!!
        writer.close();

    }

    public void addNewPokemon(int id,String name, int[] speciesValue)
    {
        PokemonValueData pokemonValueData = new PokemonValueData(speciesValue);
        PokemonSpeciesData newPokemonSpecies = new PokemonSpeciesData(id, name, pokemonValueData);
        pokemonSpeciesDataList.add(newPokemonSpecies);

    }//addNewPokemon



    public PokemonSpeciesData getPokemonData(int id)
    {
        return pokemonSpeciesDataList.get(id);
    }
    public int getPokemonSize(){
        return pokemonSpeciesDataList.size();
    }

}

//Hint: print out the string to see loaded result
//String jsonString = gson.toJson(dataArray);
//System.out.println(jsonString);