package Artwork;

public class Painting extends Artwork {

    String paintType;
    int canvasWidth, canvasHeight, canvasWeight;

    public Painting(String artistName, int valueInPounds) {
        super(artistName, valueInPounds);
        // TODO Auto-generated constructor stub
    }

    public Painting(String artistName, int valueInPounds, String paintType, int canvasWidth, int canvasHeight,
            int canvasWeight) {
        super(artistName, valueInPounds);
        this.paintType = paintType;
        this.canvasWidth = canvasWidth;
        this.canvasHeight = canvasHeight;
        this.canvasWeight = canvasWeight;

    }

    public String getPaintType() {
        return paintType;
    }

    public void setPaintType(String paintType) {
        this.paintType = paintType;
    }

    public int getCanvasWidth() {
        return canvasWidth;
    }
    public int getCanvasWeight() {
        return canvasWeight;
    }
    public int getCanvasHeight() {
        return canvasHeight;
    }
    public void setCanvasWidth(int canvasWidth) {
        if(canvasWidth>=0)
        {
            this.canvasWidth = canvasWidth;

            

        }
        else{
            showError("Width");
        }
    }

    

    public void setCanvasHeight(int canvasHeight) {
        if(canvasHeight>=0)
        {
            this.canvasHeight = canvasHeight;

        }
        else{
            showError("Height");
        }
        // this.canvasHeight = canvasHeight;
    }

    public void setCanvasWeight(int canvasWeight) {
        if(canvasHeight>=0)
        {
            this.canvasWeight = canvasWeight;

        }
        else{
            showError("Weight");
        }
        // this.canvasWeight = canvasWeight;
    }
    public void showError(String errorType){
        System.out.println("Your entered an error "+errorType);
    }

}
