public class Team implements Comparable<Team>{
    private String teamName;
    private int teamPoints;

    public Team(String teamName, int teamPoints) {
        this.teamName = teamName;
        this.teamPoints = teamPoints;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getTeamPoints() {
        return teamPoints;
    }

    @Override
    public int compareTo(Team team) {
        if (this.getTeamPoints() > team.getTeamPoints()) {
            return -1;
        } else if (this.getTeamPoints() < team.getTeamPoints()) {
            return 1;
        }
        return 0;
    }
}
