

public class Main {
    public static void main(String[] args) {
        League<FootballTeam> serieA = new League<>("Serie A");
        League<BasketballTeam> nba = new League<>("NBA");

        FootballTeam milan = new FootballTeam("AC Milan", 62);
        FootballTeam inter = new FootballTeam("Inter Milan", 75);
        FootballTeam juventus = new FootballTeam("Juventus", 70);

        serieA.addTeam(milan);
        serieA.addTeam(inter);
        serieA.addTeam(juventus);

        BasketballTeam lakers = new BasketballTeam("LA Lakers",120);
        BasketballTeam spurs = new BasketballTeam("San Antonio Spurs",114);
        BasketballTeam suns = new BasketballTeam("Phoenix Suns",102);

        nba.addTeam(lakers);
        nba.addTeam(spurs);
        nba.addTeam(suns);

        serieA.displayRanking();

    }
}
