public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        /*adelaideCrows.addPlayer(pat);
        adelaideCrows.addPlayer(beckham);*/

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("This won't work");
        brokenTeam.addPlayer(beckham);

        Team<SoccerPlayer> arsenal = new Team<>("Arsenal");
        Team<SoccerPlayer> chelsea = new Team<>("Chelshit");

        Team<BaseballPlayer> cubs = new Team<>("Chicago Cubs");
        Team<BaseballPlayer> sox = new Team<>("Chicago Sox");

        arsenal.matchResult(chelsea,2,0);
        cubs.matchResult(sox,6,4);

//        arsenal.matchResult(cubs,5,10);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() +": " + adelaideCrows.ranking());
        System.out.println(arsenal.getName() +": " + arsenal.ranking());

        System.out.println(arsenal.compareTo(chelsea));
    }
}
