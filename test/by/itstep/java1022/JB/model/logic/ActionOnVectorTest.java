package by.itstep.java1022.JB.model.logic;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ActionOnVectorTest {

    private ActionOnVector actionOnVector;

    @Before
    public void setUp() {
        actionOnVector = new ActionOnVector();
    }

    @After
    public void tearDown() {
        actionOnVector = null;
    }

    //------------------------------------- Тесты к 1 заданию -------------------------------------------

    //тест на сортировку по возрастанию с исходом true
    @Test
    public void testCheckAscendingSortingTrue() {
        //Arrange
        int[] vector = {2, 4, 6, 8, 10, 20, 30, 40};
        boolean expected = true;

        //Act
        boolean actual = actionOnVector.checkSorting(vector);

        //Assert
        assertEquals(expected, actual);
    }


    //тест на сортировку по убыванию с исходом true
    @Test
    public void testCheckDecreasingSortingTrue() {
        //Arrange
        int[] vector = {89, 64, 46, 38, 10, -9, -18, -40};
        boolean expected = true;

        //Act
        boolean actual = actionOnVector.checkSorting(vector);

        //Assert
        assertEquals(expected, actual);
    }

    //тест на отсутствие сортировки
    @Test
    public void testCheckNoSortingFalse() {
        //Arrange
        int[] vector = {2, 4, 6, 8, 0, 20, 30, -4};
        boolean expected = false;

        //Act
        boolean actual = actionOnVector.checkSorting(vector);

        //Assert
        assertEquals(expected, actual);
    }

    //вектор имеет меньше 2х элементов (защита от дурака)
    @Test
    public void testCheckNoSortingFoolProof() {
        //Arrange
        int[] vector = {};
        boolean expected = false;

        //Act
        boolean actual = actionOnVector.checkSorting(vector);

        //Assert
        assertEquals(expected, actual);
    }

//    ------------------------------------- Тесты к 2 заданию -------------------------------------------

    //вектор имеет зеркальный вид
    @Test
    public void testCheckMirrorViewTrue() {
        //Arrange
        int[] vector = {20, 10, 4, 2, 0, 2, 4, 10, 20};
        boolean expected = true;

        //Act
        boolean actual = actionOnVector.checkMirrorView(vector);

        //Assert
        assertEquals(expected, actual);
    }

    //вектор не имеет зеркальный вид
    @Test
    public void testCheckMirrorViewFalse() {
        //Arrange
        int[] vector = {20, 10, 5, 2, 0, 2, 4, 10, 20};
        boolean expected = false;

        //Act
        boolean actual = actionOnVector.checkMirrorView(vector);

        //Assert
        assertEquals(expected, actual);
    }

    //вектор имеет меньше 2х элементов (защита от дурака)
    @Test
    public void testCheckMirrorViewFoolProof() {
        //Arrange
        int[] vector = {20};
        boolean expected = false;

        //Act
        boolean actual = actionOnVector.checkMirrorView(vector);

        //Assert
        assertEquals(expected, actual);
    }

//------------------------------------- Тесты к 3 заданию -------------------------------------------

    //все элементы вектора различны
    @Test
    public void testCheckForDifferenceTrue() {
        //Arrange
        int[] vector = {2, 4, 6, 8, 10, 20, 30, 40};
        boolean expected = true;

        //Act
        boolean actual = actionOnVector.checkForDifference(vector);

        //Assert
        assertEquals(expected, actual);
    }

    //элементы вектора повторяются
    @Test
    public void testCheckForDifferenceFalse() {
        //Arrange
        int[] vector = {2, 4, 6, 20, 10, 20, 30, 40};
        boolean expected = false;

        //Act
        boolean actual = actionOnVector.checkForDifference(vector);

        //Assert
        assertEquals(expected, actual);
    }

    //вектор имеет меньше 2х элементов (защита от дурака)
    @Test
    public void testCheckForDifferenceFoolProof() {
        //Arrange
        int[] vector = {};
        boolean expected = false;

        //Act
        boolean actual = actionOnVector.checkForDifference(vector);

        //Assert
        assertEquals(expected, actual);
    }

    //------------------------------------- Тесты к 4 заданию -------------------------------------------

    //подсчет четных чисел
    @Test
    public void testCountEvenNumber() {
        //Arrange
        int[] vector = {2, 4, 5, 8, 9, 10, 13, 14, 89};
        int expected = 5;

        //Act
        int actual = actionOnVector.countEvenNumber(vector);

        //Assert
        assertEquals(expected, actual);
    }

    //вектор имеет меньше 1 элемента (защита от дурака)
    @Test
    public void testCountEvenNumberFoolProof() {
        //Arrange
        int[] vector = {};
        int expected = 0;

        //Act
        int actual = actionOnVector.countEvenNumber(vector);

        //Assert
        assertEquals(expected, actual);
    }
}