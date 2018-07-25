package atributes;

public class VisualParameters {

    private String flowerColor;
    private String leafColor;
    private int plantSize;

    public VisualParameters() {
    }

    public VisualParameters(String flowerColor, String leafColor, int plantSize) {
        super();
        this.flowerColor = flowerColor;
        this.leafColor = leafColor;
        this.plantSize = plantSize;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getLeafColor() {
        return leafColor;
    }

    public void setLeafColor(String leafColor) {
        this.leafColor = leafColor;
    }

    public int getPlantSize() {
        return plantSize;
    }

    public void setPlantSize(int plantSize) {
        this.plantSize = plantSize;
    }
}
