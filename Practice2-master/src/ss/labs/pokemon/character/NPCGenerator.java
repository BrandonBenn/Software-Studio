package ss.labs.pokemon.character;
import ss.labs.pokemon.PokemonData;
import java.util.*;
import java.util.ArrayList;
public class NPCGenerator {
    //no modifier is private
    private ArrayList<NPC> npcTemplates;
    public NPCGenerator()
    {
        npcTemplates = new ArrayList<>();
        //TODO create some NPC and put into the template list. At least one for each type of character
        NPC villager = new NPC("Bill","Farmer","Goodluck on your adventures!");

        PokemonData pikachu = new PokemonData(1,"Pikachu","Electric","Thundershock");
        PokemonTrainer trainer = new PokemonTrainer("Ashe", "Pokemon Trainer", "Gotta catch 'em all!", pikachu );
        npcTemplates.add(villager);
        npcTemplates.add(trainer);
    }
    //TODO write a public method to return npctemplates
    public ArrayList<NPC> getNpcTemplates() {
        return npcTemplates;
    }
}
