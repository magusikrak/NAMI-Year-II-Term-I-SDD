package Interface;

public class MotorSport implements Sport, TeamSport {

    String objectName, equipment, location;
    int numbersOfTeam, playersPerTeam, laps;

    public MotorSport(String objectName, String equipment, String location, int numbersOfTeam, int playersPerTeam,
            int laps) {
        this.objectName = objectName;
        this.equipment = equipment;
        this.location = location;
        this.numbersOfTeam = numbersOfTeam;
        this.playersPerTeam = playersPerTeam;
        this.laps = laps;
    }

    public int getTimeLimit() {
        return this.timeLimit;
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
