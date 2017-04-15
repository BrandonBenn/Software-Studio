package ss.labs.pokemon.character;
import ss.labs.pokemon.PokemonData;

import java.util.ArrayList;

/**
 * Created by jerry on 2017/3/7.
 * In this practice you will see the power of polymorphism
 * practice to inherit and
 */
public class NPCGenerator {
    //no modifier is private
    private ArrayList<NPC> npcTemplates;

    public NPCGenerator()
    {
        npcTemplates = new ArrayList<>();
        //TODO create some NPC and put into the template list. At least one for each type of character
        NPC harris = new NPC("Harris","Blacksmith","How are you?");
        npcTemplates.add(harris);

        NPC julio = new NPC("Julio Juan Gonzales", "Merchant", "No pain, no gain!");
        npcTemplates.add(julio);

        NPC chantelle = new NPC("Chantelle", "Student", "Good Morning!");
        npcTemplates.add(chantelle);

        NPC nurse = new NPC("Joy", "Nurse", "Do you need some help?");
        npcTemplates.add(nurse);

        PokemonData kellyPokemon = new PokemonData(1, "Pikachu", "Electric", "Thunderbolt", 70,70,30,50);
        PokemonTrainer kelly = new PokemonTrainer("Kelly", "Pokemon Trainer", "Hi, man, I challange you!", kellyPokemon);
        npcTemplates.add(kelly);

        PokemonData hannahPokemon = new PokemonData(2, "Alakazam", "Psychic", "Confusion", 100,100, 50, 20);
        PokemonTrainer hannah = new PokemonTrainer("Hannah", "Pokemon Trainer","Hi dude, let's fight!", hannahPokemon);
        npcTemplates.add(hannah);

        PokemonData kevinPokemon = new PokemonData(3, "Machamp", "Fighting", "Karate Chop", 90, 90, 130, 55);
        PokemonTrainer kevin = new PokemonTrainer("Kevin", "Pokemon Trainer", "Hey man, let's have some fun!", kevinPokemon);
        npcTemplates.add(kevin);

        PokemonData giovanniPokemon = new PokemonData(4, "Chamander", "Fire", "Ember", 100, 100, 52, 65);
        PokemonData giovanniPokemon1 = new PokemonData(5, "Charizard", "Fire", "Heat Wave", 200, 200, 84, 100);
        GymLeader giovanni = new GymLeader("Giovanni", "Gym Leader", "I am the leader in this Fire Gym, don't play with fire!'", giovanniPokemon, giovanniPokemon1);
        npcTemplates.add(giovanni);

        PokemonData jessicaPokemon = new PokemonData(6, "Oddish", "Grass", "Razor Leaf", 150, 150, 50,30);
        PokemonData jessicaPokemon1 = new PokemonData(7, "Gloom", "Grass", "Petal Blizzard", 200, 200, 65, 40);
        GymLeader jessica = new GymLeader("Jessica", "Gym Leader", "I am the leader in this Grass Gym, don't mess with me", jessicaPokemon, jessicaPokemon1);
        npcTemplates.add(jessica);

        PokemonData stevenPokemon = new PokemonData(8, "Squirtle", "Water", "Bubble", 200, 200,48, 43);
        PokemonData stevenPokemon1 = new PokemonData(9, "Wartortle", "Water", "Surf", 250, 250, 63, 58);
        GymLeader steven = new GymLeader("Steven", "Gym Leader", "I am the leader in this Water Gym, let's fight", stevenPokemon, stevenPokemon1);
        npcTemplates.add(steven);
    }

    //Try ctrl-N or command-N, click on Getter, you will see something useful
    //TODO write a public method to return npctemplates
    public ArrayList<NPC> getNpcTemplates() {
        return npcTemplates;
    }
}
