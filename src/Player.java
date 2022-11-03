public class Player {
    private String name;
    private Team team;
    private String position;
    private int goalCounter;

    Player(String name) {
        this.setName(name);
        this.setGoalCounter(0);
    }

    // void -> String
    public String getName() {
        return this.name;
    }

    //(String) -> void
    public void setName (String name) {
        this.name = name;
        return;
    }

    // (void) -> String
    public String getPosition(){
        return this.position;
    }

    // setter setPosition (String) -> void
    public void setPosition(String position){
        this.position = position;
        return;
    }

    // getter getGoalCounter (void) -> int
    public int getGoalCounter(){
        return this.goalCounter;
    }

    // setter setGoalCounter private
    private void setGoalCounter(int goalCounter){
        this.goalCounter = goalCounter;
        return;
    }

    public void makeGoal() {
        this.incrementGoalCounter();
        return;
    }


    //getter team
    public Team getTeam() {
        return this.team;
    }
    //setter team
    public void setTeam (Team team) {
        this.team = team;
        return;
    }

    public void incrementGoalCounter() {
        this.goalCounter++;
    }
}
