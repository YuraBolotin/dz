package com.bolotin;

public class Main {

    public static void main(String[] args) {
	// Задание 1
        byte box1 = 100;
        short box2 = 30000;
        int box3 = 2000000000;
        long box4 = 5000000000000L;
        float box5 = 50.86f;
        double box6 = 50567.35;
        boolean box7 = 10 > 5;
        char box8 = 33;

        // Задание 2
        float oneWeight = 78.2f;
        float twoWeight = 82.7f;

        float totalWeight = oneWeight + twoWeight;
        System.out.println("Общий вес боксеров " + totalWeight + " кг");

        float differenceWeight = twoWeight - oneWeight;
        System.out.println("Разница в весе между боксерами " + differenceWeight + " кг");

        // Задание 3
        short amountBanana = 5;
        short weightOneBonana = 80;
        int totalWeightBonana = amountBanana * weightOneBonana;

        int milkWeight = 105*2;


        int amountPlombir = 2;
        int weightOnePlombir = 100;
        int totalWeightPlombir = amountPlombir * weightOnePlombir;

        int amountEggs = 4;
        int weightOneEggs = 70;
        int totalWeightEggs = amountEggs * weightOneEggs;

        int breakfastWeight = totalWeightBonana + milkWeight + totalWeightPlombir + totalWeightEggs;
        System.out.println("Общий вес завтрака " + breakfastWeight + " грамм");

        int grPerKg = 1000;
        float weightKg = breakfastWeight/(float)grPerKg;
        System.out.println("Общий вес завтрака в килограммах " + weightKg);

        //задание 4
        int kg = 7;
        int kgPerGr = kg*1000;

        int amountDay250 = kgPerGr/250;
        System.out.println("При ежедневной потере по 250 гр, на похудение уйдет " + amountDay250 + " дней");

        int amountDay500 = kgPerGr/500;
        System.out.println("При ежедневной потере по 500 гр, на похудение уйдет " + amountDay500 + " дней");

        int average = (amountDay250 + amountDay500)/2;
        System.out.println("В среднем на похудение уйдет " + average + " дней");

        //Задание 5
        int zarplataMasha = 67760;
        int newzarplataMasha = zarplataMasha/10 + zarplataMasha;
        int differenceZarplataMasha = newzarplataMasha - zarplataMasha;
        System.out.println("Маша теперь получает " + newzarplataMasha + " рублей. Годовой доход вырос на " + differenceZarplataMasha + " рублей");

        int zarplataDenis = 83690;
        int newzarplataDenis = zarplataDenis/10 + zarplataDenis;
        int differenceZarplataDenis = newzarplataDenis - zarplataDenis;
        System.out.println("Денис теперь получает " + newzarplataDenis + " рублей. Годовой доход вырос на " + differenceZarplataDenis + " рублей");

        int zarplataKristina = 76230;
        int newzarplataKristina = zarplataKristina/10 + zarplataKristina;
        int differenceZarplataKristina = newzarplataKristina - zarplataKristina;
        System.out.println("Кристина теперь получает " + newzarplataKristina + " рублей. Годовой доход вырос на " + differenceZarplataKristina + " рублей");




    }
}
