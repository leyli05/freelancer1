package ru.netelogy.javaqa.freelancer1.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netelogy.javaqa.freelancer1.services.BonusService;

public class BonusServiceTest {

    @Test
    void shouldCalculateForOneExample() {
        BonusService service = new BonusService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateForTwoExample() {
        BonusService service = new BonusService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
