package by.itstep.java1022.JB.model.logic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ActionOnExamTest {

    private ActionOnExam actionOnExam;

    @Before
    public void setUp() {
        actionOnExam = new ActionOnExam();
    }

    @After
    public void tearDown() {
        actionOnExam = null;
    }

    //Работоспособность программы
    @Test
    public void testProcessingOfExamResult() {

        //Arrange
        int[] mark = {1, 4, 1, 5, 4, 4, 3, 2, 2, 2, 4, 5, 4, 1, 2, 3, 5};
        String expected = "Исходные оценки: " + Arrays.toString(mark) + "\n" +
                "Результаты экзамена:\n" +
                "Пятерок - 17,6% (3)\n" +
                "Четверок - 29,4% (5)\n" +
                "Троек - 11,8% (2)\n" +
                "Двоек - 23,5% (4)\n" +
                "Единиц - 17,6% (3)\n" +
                "Нулей - 0,0% (0)\n";

        //Act
        String actual = actionOnExam.processingOfExamResult(mark);

        //Assert
        assertEquals(expected, actual);
    }

    //Работоспособность защиты от дурака с числами больше 5
    @Test
    public void testProcessingOfExamResultFoolProof() {

        //Arrange
        int[] mark = {1, 4, 1, 5, 4, 4, 3, 2, 2, 2, 4, 6, 4, 1, 2, 3, 5};
        String expected = "Оценки заданы неверно!";

        //Act
        String actual = actionOnExam.processingOfExamResult(mark);

        //Assert
        assertEquals(expected, actual);
    }

    //Работоспособность защиты от дурака c отрицательными числами
    @Test
    public void testProcessingOfExamResultFoolProofTwo() {

        //Arrange
        int[] mark = {1, 4, 1, 5, 4, 4, 3, 2, 2, 2, 4, -1, 4, 1, 2, 3, 5};
        String expected = "Оценки заданы неверно!";

        //Act
        String actual = actionOnExam.processingOfExamResult(mark);

        //Assert
        assertEquals(expected, actual);
    }
}