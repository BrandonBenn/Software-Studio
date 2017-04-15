package ss.labs.pokemon;
public class PokemonData{
    public PokemonData(int id, String name, String type, String move){
        this.id = id;
        this.name = name;
        this.type = type;
        this.move = move;
    }

    private int id;
    private String name;
    private String type;
    private String move;

    public int getId()
    {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getMove() {
        return move;
    }
}
