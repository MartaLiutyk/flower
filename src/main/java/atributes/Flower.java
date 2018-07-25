package atributes;

import emums.Ground;
import emums.Multiplying;

public class Flower {

    private String name;
    private String origin;
    private Ground ground;
    private Multiplying multiplying;
    private atributes.GrowingTips growingTips;
    private atributes.VisualParameters visualParameters;

    public Flower() {
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Flower: ");
        result.append("name - " + name + ", ");
        result.append("origin - " + origin + ", ");
        result.append("ground " + ground.getRepresentation() + ",");
        result.append("multiplying - " + multiplying.getRepresentation() + ", ");
        result.append("growing tips:  " + growingTips + " ");
        result.append("visual parameters: " + visualParameters + ".");
        return result.toString();
    }

    public Flower(String name, String origin, Ground ground, Multiplying multiplying, atributes.GrowingTips growingTips, atributes.VisualParameters visualParameters) {
        this.name = name;
        this.origin = origin;
        this.ground = ground;
        this.multiplying = multiplying;
        this.growingTips = growingTips;
        this.visualParameters = visualParameters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Ground getGround() {
        return ground;
    }

    public void setGround(Ground ground) {
        this.ground = ground;
    }

    public Multiplying getMultiplying() {
        return multiplying;
    }

    public void setMultiplying(Multiplying multiplying) {
        this.multiplying = multiplying;
    }

    public atributes.GrowingTips getGrowingTips() {
        return growingTips;
    }

    public void setGrowingTips(atributes.GrowingTips growingTips) {
        this.growingTips = growingTips;
    }

    public atributes.VisualParameters getVisualParameters() {
        return visualParameters;
    }

    public void setVisualParameters(atributes.VisualParameters visualParameters) {
        this.visualParameters = visualParameters;
    }
}
