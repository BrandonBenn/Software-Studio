package ss.labs.pokemon.character;
import java.util.*;
/**
 * Created by jerry on 2017/3/7.
 */
public class NPC extends AbstractCharacter {

    //TODO more attributes are needed
    protected String quote;
    //TODO solve the error
    public NPC(String name,String job,String quote){
        //TODO call super constructor
        super(name,job);
        //TODO assign attribute
        this.quote = quote;
    }

    public void interact()
    {
        speak();
    }

    public void speak(){
        //TODO NPC say something...
        System.out.println("name: "+this.name);
        System.out.println("job: "+this.job);
        System.out.println("quote: "+this.quote);
    }

    public void showInformation(){}

    //TODO override toString()
    public String toString() {
       interact();
       return " ";
    }
}
