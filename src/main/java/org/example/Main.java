package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       for (Planet planet: Planet.values()){
           boolean checkHashEarth =  Planet.EARTH.hashCode() == planet.hashCode();
           boolean checkHashMars =  Planet.MARS.hashCode() == planet.hashCode();

           System.out.println("Name: " + planet.getName());
           System.out.println("Distance From Sun: " + planet.getDistanceFromSun() + " miles");
           System.out.println("Mass in KG: " + planet.getMassInKG() + "KG");
           System.out.println("Days for one year orbit: " + planet.getYearOrbitInEarthDays());
           System.out.println("***** Programming Info *****");
           System.out.println("Same Object as Earth?: " + Planet.EARTH.equals(planet));
           System.out.println("Same Object as Mars?: " + Planet.MARS.equals(planet));
           System.out.println("Same Object as Venus?: " + Planet.VENUS.equals(planet));
           System.out.println("Same Object as Saturn?: " + Planet.SATURN.equals(planet));
           System.out.println("Same Object as Jupiter?: " + Planet.JUPITER.equals(planet));
           System.out.println("Same Memory Address as Earth?: " + checkHashEarth);
           System.out.println("Same Memory Address as Mars?: " + checkHashMars);
           System.out.println("----------------------");
       }

    }
}