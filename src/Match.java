import java.util.Date;

public class Match {
    private Date date;
    private String location;
    private Team localTeam;
    private Team visitantTeam;
    private MatchResult result;

    Match() {
        this.result = new MatchResult(this);
    }

    Match(String location) {
        this.result = new MatchResult(this);
        this.setLocation(location);
    }

    Match(String location, Date date) {
        this.result = new MatchResult(this);
        this.setLocation(location);
        this.setDate(date);
    }

    Match(String location, Date date, Team localTeam, Team visitantTeam) {
        this.result = new MatchResult(this);
        this.setLocation(location);
        this.setDate(date);
        this.setLocalTeam(localTeam);
        this.setVisitantTeam(visitantTeam);
    }

    public String generateMarker() {
        return String.format("%s %s %s",
            this.getLocalTeam().getName(),
            this.result.generateMarker(),
            this.getVisitantTeam().getName()
        );
    }

    public void generatePlayersList() {
        this.getLocalTeam().getPlayers().forEach(player -> System.out.println(player.getName()));
        this.getVisitantTeam().getPlayers().forEach(player -> System.out.println(player.getName()));
    }

    // settter location
    public void setLocation(String location) {
        this.location = location;
    }


    //getter date
    public Date getDate(){
        return this.date;
    }

    //setter setDate::  (Date) -> void
    public void setDate(Date date){
        this.date = date;
        return;
    }

  /*public Date setDateAndGet(Date date) {
    this.setDate(date);
    return this.getDate();
  }*/

    //getter localTeam
    public Team getLocalTeam(){
        return this.localTeam;
    }

    //setter localTeam
    public void setLocalTeam(Team localTeam){
        this.localTeam = localTeam;
        return;
    }

    // getter visitantTeam
    public Team getVisitantTeam(){
        return this.visitantTeam;
    }

    //setter visitantTeam
    public void setVisitantTeam(Team visitantTeam){
        this.visitantTeam = visitantTeam;
        return;
    }



    public boolean isLocalTeam(Team team) {
        return team.getName() == this.localTeam.getName();
    }

    public boolean isVisitantTeam(Team team) {
        return team.getName() == this.visitantTeam.getName();
    }

    public void makeGoal(Team team, Player player) {
        if(!isLocalTeam(team) && !isVisitantTeam(team)) return;
        if(isLocalTeam(team)) this.result.incrementLocalTeamScore();
        if(isVisitantTeam(team)) this.result.incrementVisitantTeamScore();

        team.incrementGoalCounter();
        player.makeGoal();
    }

    public void makeLocalGoal(int playerPosition) {
        this.makeGoal(
            this.localTeam,
            this.localTeam.getPlayers().get(playerPosition)
        );
    }

    public void makeVisitantGoal(int playerPosition) {
        this.makeGoal(
            this.visitantTeam,
            this.visitantTeam.getPlayers().get(playerPosition)
        );
    }
}