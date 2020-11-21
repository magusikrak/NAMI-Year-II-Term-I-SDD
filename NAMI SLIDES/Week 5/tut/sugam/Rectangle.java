package sugam;

class Rectangle {
    int width, height;
    String str;

    public Rectangle(int width, int height, String str) {
        this.width = width;
        this.height = height;
        this.str = str;
    }

    public void draw() {
        for (int i = 0; i < this.height; i++) {
            if (i == 0) {
                System.out.print("+-----+\n");
            }
            System.out.print("|");
            for (int j = 0; j < this.width; j++) {
                System.out.print(str);
            }
            System.out.print("|\n");

            System.out.print("+-----+\n");
        }
    }

}
