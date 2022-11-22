package org.example;

public enum Planet {
    MERCURY(
            "Mercury",
            35.98  * MathValues.MILLION.getValue(),
            (MathValues.EARTH_SIZE.getLongValue() * MathValues.BILLION.getValue()) * 0.055,
            87.97
    ),
    VENUS(
            "Venus",
            67.24 * MathValues.MILLION.getValue(),
            (MathValues.EARTH_SIZE.getLongValue() * MathValues.BILLION.getValue()) * 0.815,
            224.70),
    EARTH(
            "Earth",
            91.00 * MathValues.MILLION.getValue(),
            (MathValues.EARTH_SIZE.getLongValue() * MathValues.BILLION.getValue()),
            365.26
    ),
    MARS(
            "Mars",
            141.6 * MathValues.MILLION.getValue(),
            (5972190000000000L  * MathValues.BILLION.getValue()) * 0.107,
            686.98
    ),
    JUPITER(
            "Jupiter",
            43.44 * MathValues.MILLION.getValue(),
            (5972190000000000L  * MathValues.BILLION.getValue()) * 317.83,
            4332.82
    ),
    SATURN(
            "Saturn", EARTH.distanceFromSun * 9.5,
            (MathValues.EARTH_SIZE.getLongValue() * MathValues.BILLION.getValue()) * 95.16,
            10755.70
    ),
    URANUS(
            "Uranus",
            1.8 * MathValues.BILLION.getValue(),
            (MathValues.EARTH_SIZE.getLongValue() * MathValues.BILLION.getValue()) * 14.536,
            30687.15
    ),
    NEPTUNE(
            "Neptune",
            2.8 * MathValues.BILLION.getValue(),
            (MathValues.EARTH_SIZE.getLongValue() * MathValues.BILLION.getValue()) * 17.15,
            60190.03
    );

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
