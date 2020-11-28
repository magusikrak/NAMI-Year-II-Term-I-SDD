package Art;

public class Sculpture extends Artwork {
    String material;
    int weight;

    public Sculpture(String name, int value, String material, int weight) {
        super(name, value);
        this.material = material;
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight <= 0) {
            System.out.println("error weight");
        } else {

            this.weight = weight;
        }
    }

}
