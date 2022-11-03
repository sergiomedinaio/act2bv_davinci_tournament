public class MatchResult {
    private int localTeamScore;
    private int visitantTeamScore;
    private Match match;

    public MatchResult(Match match) {
        this.match = match;
        setLocalTeamScore(0);
        setVisitantTeamScore(0);
    }

    public int getLocalTeamScore() {
        return localTeamScore;
    }

    public void setLocalTeamScore(int localTeamScore) {
        this.localTeamScore = localTeamScore;
    }

    public int getVisitantTeamScore() {
        return visitantTeamScore;
    }

    public void setVisitantTeamScore(int visitantTeamScore) {
        this.visitantTeamScore = visitantTeamScore;
    }

    //incrementVisitantTeamScore:: void -> void
    public void incrementVisitantTeamScore(){
        this.visitantTeamScore++;
        return;
    }

    //incrementLocalTeamScore:: void -> void
    public void incrementLocalTeamScore(){
        this.localTeamScore ++;
        return;
    }

    public String generateMarker() {
        return String.format("(%d) - (%d)",
            this.getLocalTeamScore(),
            this.getVisitantTeamScore()
        );
    }

}
