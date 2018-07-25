package main.java.atributes;

public class GrowingTips {

    private int temperature;
    private boolean light;

    class Watering {
        int mililiters;
        int weeks;

        Watering() {
        }

        Watering(int mililiters, int weeks) {
            this.mililiters = mililiters;
            this.weeks = weeks;
        }
    }

    public GrowingTips() {
        Watering watering = new Watering();
    }

    public GrowingTips(int temperature, boolean light, int mililiters, int weeks) {
        super();
        this.temperature = temperature;
        this.light = light;
        Watering watering = new Watering(mililiters, weeks);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isLight() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }
}
