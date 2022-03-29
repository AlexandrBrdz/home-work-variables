package ru.scypro;

public class Main {

    public static void main(String[] args) {
        // Задание 1

        byte chairs = 101;
        short phone = 32001;
        int seeds = 34534666;
        long track = 2352452345L;
        float sandWeight = 3.6f;
        double moleculeLong = 0.138547589;
        char bar = 32;
        boolean chairsIsLot = chairs > 100;
        System.out.println (chairsIsLot);

        // Задание 2

        byte boxers = 2;
        byte oneBoxer = 1;
        byte twoBoxer = 1;
        float oneBoxersWeight = 78.2f;
        float twoBoxerWeight = 82.7f;
        float totalBoxersWeight = oneBoxersWeight + twoBoxerWeight;
        float differenceBoxersWeight = twoBoxerWeight - oneBoxersWeight;
        System.out.println ("Total boxers weight " + "= " + totalBoxersWeight);
        System.out.println ("Difference boxers weight " + "=" + differenceBoxersWeight);

        // Задача 3

        short bananas = 5;
        short bananaWeightGr = 80;
        int bananaBreakfast = bananaWeightGr * bananas;
        short milk100Ml = 105;
        int milkBreakfast = milk100Ml * 2;
        byte iceBriquetteGr = 100;
        int iceBreakfast = iceBriquetteGr + iceBriquetteGr;
        byte eggs = 4;
        byte oneEggGr = 70;
        int eggsBreakfastGr = oneEggGr * eggs;
        int breakfast = bananaBreakfast + milkBreakfast + iceBreakfast + eggsBreakfastGr;
        float breakfastKg = breakfast / 1000f;
        System.out.println ("Total weight breakfast in gr. " + "= " + breakfast);
        System.out.println ("Total weight breakfast in kg. " + "= " + breakfastKg);










    }
}
