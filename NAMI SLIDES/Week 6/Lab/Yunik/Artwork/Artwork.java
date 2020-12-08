package Artwork;

/**
 * Artwork
 */
public class Artwork {

    String artistName;
    int valueInPounds;

    public Artwork(String artistName, int valueInPounds) {
        this.artistName = artistName;
        this.valueInPounds = valueInPounds;
    }

    public void showYunik() {
        System.out.println("Hi, I am artwork");
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getValueInPounds() {
        return valueInPounds;
    }

    public void setValueInPounds(int valueInPounds) {
        this.valueInPounds = valueInPounds;
    }

}