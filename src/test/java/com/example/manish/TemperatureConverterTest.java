package com.example.manish;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureConverterTest {

    // Test Celsius to Fahrenheit
    @Test
    void testCelsiusToFahrenheit() {

        assertEquals(
            32.0,
            TemperatureConverter.celsiusToFahrenheit(0),
            0.001
        );

        assertEquals(
            212.0,
            TemperatureConverter.celsiusToFahrenheit(100),
            0.001
        );
    }

    // Test Fahrenheit to Celsius
    @Test
    void testFahrenheitToCelsius() {

        assertEquals(
            0.0,
            TemperatureConverter.fahrenheitToCelsius(32),
            0.001
        );

        assertEquals(
            100.0,
            TemperatureConverter.fahrenheitToCelsius(212),
            0.001
        );
    }

    // Test Celsius to Kelvin
    @Test
    void testCelsiusToKelvin() {

        assertEquals(
            273.15,
            TemperatureConverter.celsiusToKelvin(0),
            0.001
        );

        assertEquals(
            373.15,
            TemperatureConverter.celsiusToKelvin(100),
            0.001
        );
    }

    // Test negative temperatures
    @Test
    void testNegativeTemperatures() {

        assertEquals(
            23.0,
            TemperatureConverter.celsiusToFahrenheit(-5),
            0.001
        );

        assertEquals(
            -40.0,
            TemperatureConverter.fahrenheitToCelsius(-40),
            0.001
        );
    }

    // Test absolute zero
    @Test
    void testAbsoluteZero() {

        assertEquals(
            0.0,
            TemperatureConverter.celsiusToKelvin(-273.15),
            0.001
        );
    }

    // Test invalid Kelvin temperature
    @Test
    void testInvalidKelvin() {

        assertThrows(
            IllegalArgumentException.class,
            () -> TemperatureConverter.celsiusToKelvin(-274)
        );

        assertThrows(
            IllegalArgumentException.class,
            () -> TemperatureConverter.fahrenheitToCelsius(-500)
        );
    }

    // Test invalid inputs
    @Test
    void testInvalidInputs() {

        assertThrows(
            IllegalArgumentException.class,
            () -> TemperatureConverter.celsiusToFahrenheit(Double.NaN)
        );

        assertThrows(
            IllegalArgumentException.class,
            () -> TemperatureConverter.celsiusToKelvin(Double.POSITIVE_INFINITY)
        );
    }
}

