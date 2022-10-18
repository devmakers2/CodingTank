package codingtank.aula02;

import java.util.Locale;

public class TemperatureConverter {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        double[] values = {-273.15, -40, 0, 36.5, 100};

        double temperatureInCelsius;
        double temperatureInFahrenheit;

        for (double value : values) {
            temperatureInCelsius = value;
            temperatureInFahrenheit = convertCelsiusToFahrenheit(temperatureInCelsius);
            System.out.format("%,7.2f ºC em graus Fahrenheit é: %,7.2f ºF%n",
                              temperatureInCelsius, temperatureInFahrenheit);
        }
    }

    static double convertCelsiusToFahrenheit(double temperatureInCelsius) {
        final double FATOR1 = 9/5.0;
        final int FATOR2 = 32;
        return (temperatureInCelsius * FATOR1) + FATOR2;
    }
}
