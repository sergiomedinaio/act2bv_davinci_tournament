import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int goalCounter = 0;

    //setter name
    public void setName (String name){
        this.name = name;
        return;
    }

    //getter name
    public String getName (){
        return this.name;
    }

    //getter players
    public ArrayList<Player> getPlayers(){
        return this.players;
    }

    //setter players
    public void setPlayers (ArrayList<Player> players){
        this.players = players;
        return;
    }

    //addPlayer:: (Player) -> void
    public void addPlayer (Player player) {
        return;
    }

    public void removePlayer (Player player){
        return;
    }

    //getter goalCounter:: void -> int
    public int getGoalCounter() {
        return this.goalCounter;
    }

    //incrementGoalCounter:: (void) -> void
    public void incrementGoalCounter() {
        //this.goalCounter = this.goalCounter + 1; //autoasignación
        //this.goalCounter += 1;
        this.goalCounter++;
        return;
    }
}
