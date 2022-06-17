package com.company;

import java.util.*;

/*Необхідно написати програму для того, щоб виконати наступні дії:
- сформувати колекцію-масив;
- вивести її на екран у вигляді рядка;
- виконати вказані у завдання дії;
- вивести результат, причому, якщо колекція-масив була змінена – то вивести на
екран модифіковану колекцію-масив у вигляді наступного рядка.
Всі вказані дії необхідно реалізувати за допомогою окремих підпрограм. Інформація у
підпрограми повинна передаватися лише за допомогою параметрів. Використання
глобальних змінних – не допускається.*/

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        ArrayList<Double> arrayList2 = new ArrayList<>(); //- сформувати колекцію-масив;

        System.out.print("Уведіть кількість чисел у масиві: ");
        int numbersCount = sc.nextInt();
        for (int i = 0; i < numbersCount; i++) {
            arrayList2.add((Math.random() * 100 - 50));
            printCollection(arrayList2);
        }
        System.out.println("\nСереднє арифметичне: " + calculateAvg(arrayList2));
    }

    public static void printCollection(ArrayList<Double> list){ //- вивести її на екран у вигляді рядка;
        System.out.println("\n>Колекція: ");
        System.out.print(list);
    }

    public static double calculateAvg(ArrayList<Double> list){
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }
}
