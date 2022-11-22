package org.example;

public enum MathValues
{
    MILLION(1000000),
    BILLION(1000 * MILLION.value);

    public int getValue() {
        return value;
    }

    private final int value;

    MathValues(int value) {
        this.value = value;
    }
}
