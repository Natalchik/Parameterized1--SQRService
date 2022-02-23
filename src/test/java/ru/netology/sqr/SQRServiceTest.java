package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    //Test 1
    @Test
    void countSquaresFrom200To300() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int min = 200;
        int max = 300;
        int expected = 3;

        // вызываем целевой метод:
        int actual = service.countSquares(min, max);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }


    //Test 2
    @Test
    void countSquaresFrom100To300() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int min = 100;
        int max = 300;
        int expected = 8;


        // вызываем целевой метод:
        int actual = service.countSquares(min, max);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    //Test 3
    @Test
    void countSquaresFrom9604To9801() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int min = 9604;
        int max = 9801;
        int expected = 2;


        // вызываем целевой метод:
        int actual = service.countSquares(min, max);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}