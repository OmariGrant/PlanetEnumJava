package org.example;

public enum MathValues
{
    //place 0 for unused parameter
    MILLION(1000000, 0),
    BILLION(1000 * MILLION.value, 0),

    EARTH_SIZE(0, 5972190000000000L);

    public int getValue() {
        return value;
    }

    private final int value;

    public long getLongValue() {
        return longValue;
    }

    private final long longValue;

    MathValues(int value, long longValue) {
        this.value = value;
        this.longValue = longValue;
    }

}
