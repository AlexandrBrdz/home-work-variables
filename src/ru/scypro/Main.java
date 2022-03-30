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
        char space = 32;
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
        System.out.println ("Общий вес двух бойцов " + "= " + totalBoxersWeight);
        System.out.println ("Разницу между весами бойцов " + "=" + differenceBoxersWeight);

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
        System.out.println ("Вес спорт-завтрака в граммах " + "= " + breakfast);
        System.out.println ("Вес спорт-завтрака в килограммах " + "= " + breakfastKg);

         // Задача 4

        byte needLooseKg = 7;
        short oneKg = 1000;
        int needLooseGr = needLooseKg * oneKg;
        short loose250 = 250;
        short loose500 = 500;
        int howManyDays250 = needLooseGr / loose250;
        int howManyDays500 = needLooseGr / loose500;
        int middle = loose250 + loose500;
        int middleDays = middle / 2;
        int needMiddleDays = needLooseGr / middleDays;
        System.out.println ("Дней уйдет если худеть по 250 гр " + "- " + howManyDays250);
        System.out.println ("Дней уйдет если худеть по 500 гр " + "- " + howManyDays500);
        System.out.println ("Дней уйдет в среднем " + "- " + needMiddleDays);

        // Задача 5

        double salaryMasha = 67.760;
        double salaryDenis = 83.690;
        double salaryKristina = 76.230;
        double increaseBy10PercentM = salaryMasha * 10 / 100;
        double increaseBy10PercentD = salaryDenis * 10 / 100;
        double increaseBy10PercentK = salaryKristina * 10 / 100;
        double increaseMonthM = salaryMasha + increaseBy10PercentM;
        double increaseMonthD = salaryDenis + increaseBy10PercentD;
        double increaseMonthK = salaryKristina + increaseBy10PercentK;
        double annualSalaryM = salaryMasha * 12;
        double annualSalaryD = salaryDenis * 12;
        double annualSalaryK = salaryKristina * 12;
        double increaseAnnualSalaryM = increaseMonthM * 12;
        double increaseAnnualSalaryD = increaseMonthD * 12;
        double increaseAnnualSalaryK = increaseMonthK * 12;
        double differenceAnnualSalaryM = increaseAnnualSalaryM - annualSalaryM;
        double differenceAnnualSalaryD = increaseAnnualSalaryD - annualSalaryD;
        double differenceAnnualSalaryK = increaseAnnualSalaryK - annualSalaryK;

        System.out.println ("Маша теперь получает " + "- " + increaseMonthM + space + "рублей в месяц ");
        System.out.println ("Зарплата Маши выросла на " + "- " + increaseBy10PercentM + space + "рублей в месяц");
        System.out.println ("Годовой доход Машы теперь " + "- " + increaseAnnualSalaryM + space + "рублей ");
        System.out.println ("Годовой доход Машы вырос на " + "- " + differenceAnnualSalaryM + space + "рублей ");
        System.out.println (space);

        System.out.println ("Денис теперь получает " + "- " + increaseMonthD + space + "рублей в месяц ");
        System.out.println ("Зарплата Дениса выросла на " + "- " + increaseBy10PercentD + space + "рублей в месяц");
        System.out.println ("Годовой доход Дениса теперь " + "- " + increaseAnnualSalaryD + space + "рублей ");
        System.out.println ("Годовой доход Дниса вырос на " + "- " + differenceAnnualSalaryD + space + "рублей ");
        System.out.println (space);

        System.out.println ("Кристина теперь получает " + "- " + increaseMonthK + space + "рублей в месяц ");
        System.out.println ("Зарплата Кристины выросла на " + "- " + increaseBy10PercentK + space + "рублей в месяц");
        System.out.println ("Годовой доход Кристины теперь " + "- " + increaseAnnualSalaryK + space + "рублей ");
        System.out.println ("Годовой доход Кристины вырос на " + "- " + differenceAnnualSalaryK + space + "рублей ");



















    }
}
