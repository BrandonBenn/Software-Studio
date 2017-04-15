package com.sslab.pokemon.data;

/**
 * Created by jerry on 2017/3/21.
 */
public class PokemonIndividualData {
    //TODO create variables and constructor for this class
    private String nickName;
    private int speciesID;
    private PokemonValueData values;

   public PokemonIndividualData(String name, int id, PokemonValueData val){
    this.nickName = name;
    this.speciesID = id;
    this.values = val;
   }//PokemonIndividualData

    public String getNickName() {return nickName;}

    public int getSpeciesID() {return speciesID;}

    public PokemonValueData getValues() {return values;}

}
