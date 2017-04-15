package ss.labs.pokemon.character;
import ss.labs.pokemon.PokemonData;
import ss.labs.pokemon.character.ss.labs.pokemon.character.Player;

public class Nurse extends NPC{
    public Nurse(String name, String job, String quote){
        super(name,job,quote);
    }

    public void interact(Player you) {
        System.out.println("You go Pokemon Center..");
        speak();
        heal(you.getmyPokemon());
    }//interact

    public void heal(PokemonData po){
        po.setCurrentHP(po.getMaxHP());
        System.out.println(this.name+": Your "+po.getName()+" has been fully healed! Here you go!");
    }//heal
}