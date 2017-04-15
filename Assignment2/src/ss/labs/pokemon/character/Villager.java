package ss.labs.pokemon.character;
import ss.labs.pokemon.character.ss.labs.pokemon.character.Player;
import java.util.Random;

public class Villager extends NPC{
    public Villager (String name, String job, String quote){
        super(name,job,quote);
    }
    public void interact(Player you) {
        speak();
        giveMoney(you);
    }//interact

    private void giveMoney(Player you){
        Random rand = new Random();
        int money = rand.nextInt(30);
        System.out.println(this.name+": Here's some money for your travels!");
        System.out.println(this.name+" gives you $"+money);
        you.setMoney(you.getMoney() + money);
    }//giveMoney
}
