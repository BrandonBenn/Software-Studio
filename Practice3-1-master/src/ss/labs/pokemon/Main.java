package ss.labs.pokemon;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.*;

//TODO: Practice3-1
public class Main {
    public static void main(String[] args) {
        //TODO: Create a pokedex and load json data
        Pokedex pokedex = new Pokedex("bin/pokedex.json");
        //TODO: Enable user input to key in pokemon species data.
        Scanner input = new Scanner(System.in);
        //TODO: You can use a loop to get multiple entries of data
        while (true){
            System.out.println("Enter Pokemon ID:");
            int pokeID = input.nextInt();

            System.out.println("Enter Pokemon Name:");
            String pokeName = input.next();

            System.out.println("Enter Pokemon Special value:");
            int[] specialValue = new int[6];
            for (int i=0; i<6; i++)
                specialValue[i] = input.nextInt();

            pokedex.addNewPokemon(pokeID,pokeName,specialValue);
            System.out.println("Quit? Yes or No");
            String quit = new String();
            quit = input.next();
            if (quit.equals("yes")) break;
        }//endWhile

        //TODO: Well, one entry is fine if you are lazy~
        //TODO: save file into pokedex_practice.json
        try {pokedex.saveFile("pokedex_practice.json");}
        catch (IOException e){
            e.printStackTrace();
        }//catch

    }
}
