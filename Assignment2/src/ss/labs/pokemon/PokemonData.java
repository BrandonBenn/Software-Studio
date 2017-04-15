package ss.labs.pokemon;

/**
 * Created by jerry on 2017/3/7.
 */
public class PokemonData{
    public PokemonData(int id, String name, String type, String move, int maxHP, int currentHp, int attack, int speed){
        this.id = id;
        this.name = name;
        this.type = type;
        this.move = move;
        this.maxHP = maxHP;
        this.currentHP = currentHp;
        this.attack = attack;
        this.speed = speed;
    }

    private int id;
    private String name;
    private String type;
    private String move;
    private int maxHP;

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    private int currentHP;
    private int attack;
    private int speed;

    public int getId() {
        return id;
    }

    //Try ctrl-N or command-N, click on Getter, you will see something useful
    //TODO implement "get function" for name
    public String getName() {
        return name;
    }

    //TODO implement "get function" for type
    public String getType() {
        return type;
    }

    public String getMove() {
        return move;
    }

    public int getMaxHP(){
        return maxHP;
    }

    public int getCurrentHP(){
        return currentHP;
    }

    public int getAttack(){
        return attack;
    }

    public int getSpeed(){
        return speed;
    }
}
