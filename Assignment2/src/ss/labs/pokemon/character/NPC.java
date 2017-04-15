package ss.labs.pokemon.character;

/**
 * Created by jerry on 2017/3/7.
 */
public class NPC extends AbstractCharacter {

    public String getQuote() {
        return quote;
    }

    //TODO more attributes are needed
    protected String quote;

    //TODO solve the error
    public NPC(String name,String job,String quote){
        //TODO call super constructor
        super(name, job);
        //TODO assign attribute
        this.quote = quote;
    }

    public void interact()
    {
        speak();
    }

    public void speak(){
        System.out.println(quote);
        showInformation();
    }

    public String toString(){
        return "You meet " + name + " who is a " + job + " , " + " ' " + quote + " ' ";
    }

    public void showInformation(){System.out.println(toString());}

}
