package lab3.theory.converterfull.fullinterface;

import lab3.theory.converter.convertInterface.Converter;

public interface ConverterFull extends Converter {

    public static double fromFahrenheit(double grad){
        return (grad - 32)/1.8;
    }

}
