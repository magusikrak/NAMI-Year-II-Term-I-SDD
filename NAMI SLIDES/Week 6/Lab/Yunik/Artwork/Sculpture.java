package Artwork;

public class Sculpture extends Artwork {

    String material;
    int weight;

    // public Sculpture(String artistName, int valueInPounds) {
    // super(artistName, valueInPounds);
    // // TODO Auto-generated constructor stub
    // }

    public Sculpture(String artistName, int valueInPounds, String material, int weight) {
        super(artistName, valueInPounds);
        // Artwork sculp=new Artwork(artistName,valueInPounds);

        // this(artistName,valueInPounds);

        this.material = material;
        this.weight = weight;
    }

    public void showDetails() {
        showYunik();
        System.out.println("Kashi");
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
        this.weight = weight;
    }

}
