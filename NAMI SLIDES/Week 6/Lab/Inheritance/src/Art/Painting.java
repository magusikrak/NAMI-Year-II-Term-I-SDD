package Art;

public class Painting extends Artwork {
    String type;
    int width, height;

    public Painting(String name, int value, String type, int width, int height) {
        super(name, value);
        this.type = type;
        this.width = width;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0) {
            System.out.println("error weight");
        } else {

            this.width = width;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height <= 0) {
            System.out.println("error weight");
        } else {

            this.height = height;
        }
    }

}
