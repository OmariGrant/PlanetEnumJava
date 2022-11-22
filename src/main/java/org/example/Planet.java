package org.example;

public enum Planet {
    MERCURY("Mercury", 35.98  * MathValues.MILLION.getValue(), 0, 0),
    VENUS("Venus", 67.24 * MathValues.MILLION.getValue(), 0, 0),
    EARTH("Earth", 91.00 * MathValues.MILLION.getValue(), 0, 0),
    MARS("Mars", 141.6 * MathValues.MILLION.getValue(), 0, 0),
    JUPITER("Jupiter", 43.44 * MathValues.MILLION.getValue(), 0, 0),
    SATURN("Saturn", EARTH.distanceFromSun * 9.5, 0, 0),
    URANUS("Uranus", 1.8 * MathValues.BILLION.getValue(), 0, 0),
    NEPTUNE("Neptune", 2.8 * MathValues.BILLION.getValue(), 0, 0);

    private final String name;
    private final double distanceFromSun;
    private final double massInKG;
    private final double yearOrbitInEarthDays;

    public String getName() {
        return name;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getMassInKG() {
        return massInKG;
    }

    public double getYearOrbitInEarthDays() {
        return yearOrbitInEarthDays;
    }

    private Planet(String name, double distanceFromSun, double massInKG, double yearOrbitInEarthDays){
        this.name = name;
        this.distanceFromSun = distanceFromSun;
        this.massInKG = massInKG;
        this.yearOrbitInEarthDays = yearOrbitInEarthDays;
    }
}
