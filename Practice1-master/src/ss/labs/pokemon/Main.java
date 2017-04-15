package ss.labs.pokemon;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<PokemonData> pokedex = new ArrayList();
        HashMap <String,Integer> typeCountMap = new  HashMap();
        System.out.println("Load the data...");
        int testData = input.nextInt();
        for (int i = 0; i<testData; i++)
        {
            System.out.println("Enter pokemon name:");
            String name = input.next();
            System.out.println("Enter pokemon type:");
            String type = input.next();
            type = type.toLowerCase();
            System.out.println("Enter pokemon's move name:");
            String move = input.next();
            PokemonData newPokemon = new PokemonData(name,type,move);
            pokedex.add(newPokemon);
        }//endFor

        System.out.println("Game Start");
        int pts = 0, count = 1;
        HashMap<String, Integer> caughtPokemon = new HashMap();
        while (true){
        Random rand = new Random();
        int pokedexSize = pokedex.size();
        int randomVal = rand.nextInt(pokedexSize);
        PokemonData randomPokemon = pokedex.get(randomVal);
        System.out.println("name: "+randomPokemon.name+", type: "+randomPokemon.type+", move's name: "+randomPokemon.move);
        String react =input.next();

            if (react.equals("catch")) {
                System.out.println("You catch " + randomPokemon.name + " !");
                if (randomPokemon.type.equals("grass")) {
                    pts++;
                }
                else pts--;
                    if (caughtPokemon.containsKey(randomPokemon.type))
                        caughtPokemon.put(randomPokemon.type, count + 1);
                    else caughtPokemon.put(randomPokemon.type, count);
            }//endIF

            else if (react.equals("run")) {
                System.out.println("Run away successfully !");
                if (randomPokemon.type.equals("grass")) pts--;
                else pts++;
            }//endIF

            else if (react.equals("quit")) {
                System.out.println("You quit the game.");
                System.out.println("Score: " + pts);
                for (String key: caughtPokemon.keySet())
                    System.out.println(key+": "+caughtPokemon.get(key));
                break;
            }//endIF

            else {
                    System.out.println("You type the wrong command! The pokemon runs away !");
                    if(randomPokemon.type.equals("grass"))  pts--;
            }//endElse
        }//endWhile
    }//void main
}//class Main