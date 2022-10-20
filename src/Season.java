import java.util.ArrayList;
import java.util.Date;

public class Season{
    private String name;
    private Date startDate;
    private Date endDate;
    private ArrayList<Match> matchs;

    Season() {
        this.setMatchs(new ArrayList<Match>());
    }

    Season(String name) {
        this.setMatchs(new ArrayList<Match>());
        this.setName(name);
    }

    Season(String name, Date startDate, Date endDate) {
        this.setMatchs(new ArrayList<Match>());
        this.setName(name);
        this.setStartDate(startDate);
        this.setEndDate(endDate);
    }

    public void setName(String name){
        this.name = name;
        return;
    }

    public String getName(){
        return this.name;
    }

    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }

    public Date getStartDate(){
        return this.startDate;
    }

    public Date getEndDate(){
        return this.endDate;
    }

    public void setEndDate (Date endDate){
        this.endDate = endDate;
        return;
    }

    // este no lo entendí. No tendría que recibir un Match en vez de un date??
    public ArrayList<Match> getMatchsByDate(Date date){
        return this.matchs;
    }

    public void addMatch(Match match){
        this.matchs.add(match);
        return;
    }


    public ArrayList<Match> getMatchs() {
        return this.matchs;
    }

    public void setMatchs(ArrayList<Match> matchs) {
        this.matchs = matchs;
    }
}