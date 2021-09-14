package lab3.theory.converter.convertClass;

import lab3.theory.converter.convertInterface.Converter;

public class CelciumToFahrenheit implements Converter {
    @Override
    public double convert(double grad) {
        return 1.8*grad + 32;
    }
}
