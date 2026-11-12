package com.example.manish;

public class TemperatureConverter {

    // Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {

        validateTemperature(celsius);

        return (celsius * 9 / 5) + 32;
    }

    // Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {

        validateTemperature(fahrenheit);

        double celsius = (fahrenheit - 32) * 5 / 9;

        validateKelvin(celsius + 273.15);

        return celsius;
    }

    // Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {

        validateTemperature(celsius);

        double kelvin = celsius + 273.15;

        validateKelvin(kelvin);

        return kelvin;
    }

    // Validate input values
    private static void validateTemperature(double temperature) {

        if (Double.isNaN(temperature) ||
            Double.isInfinite(temperature)) {

            throw new IllegalArgumentException(
                "Invalid temperature input"
            );
        }
    }

    // Kelvin cannot be below absolute zero
    private static void validateKelvin(double kelvin) {

        if (kelvin < 0) {

            throw new IllegalArgumentException(
                "Temperature cannot be below absolute zero"
            );
        }
    }

    public static void main(String[] args) {

        double celsius = 0;
        double fahrenheit = 98.6;

        System.out.println("Celsius : " + celsius);

        System.out.println(
            "Celsius to Fahrenheit : "
            + celsiusToFahrenheit(celsius)
        );

        System.out.println(
            "Fahrenheit to Celsius : "
            + fahrenheitToCelsius(fahrenheit)
        );

        System.out.println(
            "Celsius to Kelvin : "
            + celsiusToKelvin(celsius)
        );
    }
}
