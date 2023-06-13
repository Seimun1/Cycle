package ru.netology.javaqa.hwcycles.services;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.javaqa.hwcycles.services.RelaxCalcService;

public class RelaxCalcServiceTest {
    @Test
    public void testCalcMonthsRelaxInYear() {
        RelaxCalcService service = new RelaxCalcService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int actual = service.calculate(income, expenses, threshold);
        int expected = 2;

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }
}
