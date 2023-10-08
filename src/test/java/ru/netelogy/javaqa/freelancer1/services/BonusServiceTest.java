package ru.netelogy.javaqa.freelancer1.services;

import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
//import org.junit.jupiter.params.provider.CsvSource;


public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bonus.csv")

    public void shouldCalculateForExample(int expected, int income, int expenses, int threshold) {
        BonusService service = new BonusService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }


//@Test
//void shouldCalculateForTwoExample() {
//BonusService service = new BonusService();
//int income = 10_000;
//int expenses = 3_000;
//int threshold = 20_000;
//int expected = 3;
//int actual = service.calculate(income, expenses, threshold);
//Assertions.assertEquals(expected, actual);
}
