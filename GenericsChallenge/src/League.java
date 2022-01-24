import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {
    private String leagueName;
    private List<T> leagueTeams = new ArrayList<>();

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public void addTeam(T team) {
        leagueTeams.add(team);
        System.out.println("Added " + team.getTeamName() + " to " + leagueName);
    }

    public void displayRanking() {
        Collections.sort(leagueTeams);
        System.out.println("-------------------------");
        for (int i = 0; i < leagueTeams.size(); i++) {
            System.out.println((i+1) + ". " + leagueTeams.get(i).getTeamName() + "\t" + leagueTeams.get(i).getTeamPoints());
        }
        System.out.println("-------------------------");
    }


}
