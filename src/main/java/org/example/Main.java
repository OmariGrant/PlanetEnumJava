package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       for (Planet planet: Planet.values()){
           boolean checkHash =  Planet.EARTH.hashCode() == planet.hashCode();
           
           System.out.println("Name: " + planet.getName());
           System.out.println("Distance From Sun: " + planet.getDistanceFromSun() + " miles");
           System.out.println("Mass in KG: " + planet.getMassInKG() + "KG");
           System.out.println("Same Object as Earth?: " + Planet.EARTH.equals(planet));
           System.out.println("Same Memory Address as Earth?: " + checkHash);
           System.out.println("Days for one year orbit: " + planet.getYearOrbitInEarthDays());
           System.out.println("----------------------");
       }

        if(Planet.MARS.getDistanceFromSun() != Planet.EARTH.getDistanceFromSun()){
            System.out.println("Not the same distance");
        }


    }
}