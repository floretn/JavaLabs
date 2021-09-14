package lab3.theory.converter.convertClass;

import lab3.theory.converter.convertInterface.Converter;

public class CelciumToKelvin implements Converter {
    @Override
    public double convert(double grad) {
        return grad + 273.15;
    }
}
