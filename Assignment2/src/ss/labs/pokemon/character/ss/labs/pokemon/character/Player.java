package ss.labs.pokemon.character.ss.labs.pokemon.character;

import ss.labs.pokemon.PokemonData;
import ss.labs.pokemon.character.NPC;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

public class Player {
    protected String name;
    protected int money = 0;
    protected PokemonData pokemonData;
    protected ArrayList<String> badgeList = new ArrayList<>();

    public Player(String name, PokemonData data) {
        this.name = name;
        this.money = 0;
        this.pokemonData = data;
    }

    public void PokeCenter(PokemonData data){
        System.out.println("You meet Joy who is a muddacunt");

    }

    public void Talk(NPC person){
        System.out.println("You meet "+person.getName()+" who is a "+person.getJob());
        if (person.getJob().equals("Nurse")){
            System.out.println(person.getQuote());
            pokemonData.setCurrentHP(pokemonData.getMaxHP());
            System.out.println(person.getName()+": Your pokemon is full of HP! Here you go!");
        }
        else if(person.getJob().equals("Pokemon Trainer")){
            boolean battleWon = false;
            battleWon = ;//TODO Battle function
            if (battleWon) this.money = this.money+10;
            else {
                this.money = 0;
            }
        }//pokemon trainer
        else if (person.getJob().equals("Gym Leader")){
            boolean battleWon = false;
            battleWon = ;//TODO Battle function
            if (battleWon) this.money = this.money+10;
            else {
                this.money = 0;

            }
        }//Gym leader
        else{
            Random rand = new Random();
            person.speak();
            this.money = this.money+rand.nextInt(30);
        }//Villagers

    }

    public Command(String c){
        if (c.equals("talk")){

        }//endif
    }
}
