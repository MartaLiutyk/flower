package main.java.enums;

public enum Ground {
    PODZOLIC("podzolic"), SOILS("soils"), TURF_PODZOLIC("turf-podzolic");

    private String representation;

    private Ground(String representation) {
        this.representation = representation;
    }

    public String getRepresentation() {
        return representation;
    }
}
