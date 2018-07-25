package main.java.enums;

public enum Multiplying {
    LEAVES("leaves"), CUTTINGS("cuttings"), SEED("seed");
    private String representation;

    private Multiplying(String representation) {
        this.representation = representation;
    }

    public String getRepresentation() {
        return representation;
    }
}
