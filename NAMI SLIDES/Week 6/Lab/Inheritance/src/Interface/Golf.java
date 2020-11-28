package Interface;

public class Golf implements Sport {
    String objectName, equipment, location;

    public Golf(String objectName, String equipment, String location) {
        this.objectName = objectName;
        this.equipment = equipment;
        this.location = location;
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
