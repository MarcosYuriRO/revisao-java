package com.marcos.exercicios.Desafio04;

public class DistanceConverter {

    public double metersToCentimeters(double meters){
        double centimetersConverted = meters * 100;
        return centimetersConverted;
    }

    public double centimeterToMeters(double centimeters){
        double metersConverted = centimeters / 100;
        return metersConverted;
    }

    public double kilometersToMeters(double kilometers){
        double metersConverted = kilometers * 1000;
        return metersConverted;
    }

    public double metersToKilometers (double meters){
        double kilometersConverted = meters / 1000;
        return kilometersConverted;
    }

    public double metersToMiles(double meters){
        double milesConverted = meters / 1600;
        return milesConverted;
    }

}
