package ss.labs.pokemon.character;
import ss.labs.pokemon.PokemonData;

public class GymLeader extends NPC {
        protected PokemonData pokemonData;
        protected PokemonData pokemonData1;

        //TODO solve the error
        public GymLeader(String name, String job, String quote, PokemonData data, PokemonData data1)
        {
            //TODO call super constructor
            super(name, job, quote);
            //TODO assign attributes
            this.pokemonData = data;
            this.pokemonData1 = data1;
        }

        public void showInformation() {
            super.showInformation();
            System.out.println(pokemonData.getId());
            System.out.println(pokemonData.getName());
            System.out.println(pokemonData.getType());
            System.out.println(pokemonData.getMove());
            System.out.println(pokemonData.getMaxHP());
            System.out.println(pokemonData.getCurrentHP());
            System.out.println(pokemonData.getAttack());
            System.out.println(pokemonData.getSpeed());
            System.out.println(pokemonData1.getId());
            System.out.println(pokemonData1.getName());
            System.out.println(pokemonData1.getType());
            System.out.println(pokemonData1.getMove());
            System.out.println(pokemonData1.getMaxHP());
            System.out.println(pokemonData1.getCurrentHP());
            System.out.println(pokemonData1.getAttack());
            System.out.println(pokemonData1.getSpeed());
        }

        //TODO override toString()
        public String toString(){
            return name+job+quote;
        }
}

