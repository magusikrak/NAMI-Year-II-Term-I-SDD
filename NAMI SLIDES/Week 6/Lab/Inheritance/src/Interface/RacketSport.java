package Interface;

public class RacketSport implements Sport{
    String objectName, equipment, location;
    int scoreLimit;
    public RacketSport(String objectName, String equipment, String location, int scoreLimit) {
        this.objectName = objectName;
        this.equipment = equipment;
        this.location = location;
        this.scoreLimit = scoreLimit;
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
