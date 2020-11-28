package Interface;

public class BallSport implements Sport, TeamSport {

    String objectName, equipment, location;
    int numbersOfTeam, playersPerTeam, timeLimit;

    public BallSport(String objectName, String equipment, String location, int numbersOfTeam, int playersPerTeam,
            int timeLimit) {
        this.objectName = objectName;
        this.equipment = equipment;
        this.location = location;
        this.numbersOfTeam = numbersOfTeam;
        this.playersPerTeam = playersPerTeam;
        this.timeLimit = timeLimit;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    @Override
    public int getNumberOfTeams() {
        // TODO Auto-generated method stub
        return this.numbersOfTeam;
    }

    @Override
    public int getPlayersPerTeam() {
        // TODO Auto-generated method stub
        return this.playersPerTeam;
    }

    @Override
    public String getEquipment() {
        // TODO Auto-generated method stub
        return this.equipment;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return this.objectName;
    }

    @Override
    public String getLocation() {
        // TODO Auto-generated method stub
        return this.location;
    }

}
