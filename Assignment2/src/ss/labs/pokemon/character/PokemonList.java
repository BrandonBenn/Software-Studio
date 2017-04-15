package ss.labs.pokemon.character;
import ss.labs.pokemon.PokemonData;
import java.util.ArrayList;

public class PokemonList {
    private ArrayList<PokemonData> starterPokemon;

    public PokemonList(){
        starterPokemon = new ArrayList<>();

        PokemonData charizard = new PokemonData(1, "Charizard", "Fire", "Flamethrower", 200, 200, 84, 100);
        starterPokemon.add(charizard);

        PokemonData blastoise = new PokemonData(2, "Blastoise", "Water", "Hydropump", 230, 230, 80, 90);
        starterPokemon.add(blastoise);

        PokemonData bulbasoar = new PokemonData(3, "Bulbasoar", "Grass", "Razor Leaf", 190, 190, 87, 120);
        starterPokemon.add(bulbasoar);

        PokemonData mewtwo = new PokemonData(4, "Mewtwo", "Psychic", "Solar", 500, 500, 200, 200);
        starterPokemon.add(mewtwo);
    }

    public ArrayList<PokemonData> getStarterPokemon() {
        return starterPokemon;
    }
}