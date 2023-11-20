package ru.job4j.ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(200);
        System.out.println("200 rubles are " + dollar + " dollar.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float in2 = 200;
        float expected2 = 3.33f;
        float out2 = Converter.rubleToDollar(in2);
        float threshold = 0.01f;
        boolean passed2 = Math.abs(expected2 - out2) < threshold;
        System.out.println("200 rubles are 3.33. Test result : " + passed2);
    }
}