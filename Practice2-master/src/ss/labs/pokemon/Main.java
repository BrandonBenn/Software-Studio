package ss.labs.pokemon;
import ss.labs.pokemon.character.AbstractCharacter;
import ss.labs.pokemon.character.NPC;
import ss.labs.pokemon.character.NPCGenerator;

import java.util.*;
public class Main {
    public static void main(String[] args) {
	    //TODO create a character generator
        NPCGenerator generator1 = new NPCGenerator();
        //TODO get all characters from character generator
        ArrayList<NPC> characterList = generator1.getNpcTemplates();
        //TODO print out characters' information, you can choose to use toString or showDescription
        for (NPC it: characterList){
            System.out.println(it.toString());
        }//endfor
    }//main
}
