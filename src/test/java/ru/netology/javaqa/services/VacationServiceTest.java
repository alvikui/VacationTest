package ru.netology.javaqa.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files ="src/test/resources/vacationData")
    void calculateVacation(int spending, int income, int expenses, int threshold) {
        VacationService service = new VacationService();
        int vacation = service.calculateVacation(income, expenses, threshold);
        Assertions.assertEquals(vacation, spending);
    }


//    @Test
//    public void calculateVacation() {
//        VacationService service = new VacationService();
//
//        int income = 10_000; //Доход
//        int expenses = 3_000; //Расход
//        int threshold = 20_000; //Порог
//
//        int spending = 3; //Траты на отдых
//        int vacation = service.calculateVacation(10_000, 3_000, 20_000);
//
//        Assertions.assertEquals(vacation, spending);
//    }
}
