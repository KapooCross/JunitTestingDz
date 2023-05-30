package by.itstep.java1022.JB.model.logic;

import java.util.Arrays;

public class ActionOnVector {

    //сортировка
    public boolean checkSorting(int[] vector) {
        int countAscending = 1;
        int countDecreasing = 1;
        boolean rez;

        if (vector.length < 2) {
            return false;
        }

        for (int i = 0; i < vector.length - 1; i++) {
            if (vector[i] > vector[i + 1]) {
                countAscending++;
            }
            if (vector[i] < vector[i + 1]) {
                countDecreasing++;
            }
        }
        if (vector.length == countAscending || vector.length == countDecreasing) {
            rez = true;
        } else {
            rez = false;
        }
        return rez;
    }

    //все элементы расположены в зеркальном виде относительно середины
    public boolean checkMirrorView(int[] vector) {
        int count = 0;
        boolean rez = false;

        if (vector.length < 2) {
            return false;
        }

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == vector[vector.length - i - 1]) {
                count++;
            } else {
                rez = false;
                break;
            }
            if (count == vector.length - 1) {
                rez = true;
            }
        }

        return rez;
    }

    //проверяет что все элементы вектора различны
    public boolean checkForDifference(int[] vector) {
        int count = 0;

        if (vector.length < 2) {
            return false;
        }

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                if (vector[i] == vector[j]) {
                    count++;
                }
                if (count > vector.length) {
                    return false;
                }
            }
        }

        return true;
    }

    //подсчитывает количество только четных элементов вектора
    public int countEvenNumber(int[] vector) {
        int count = 0;

        if (vector.length < 1) {
            return 0;
        }

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
