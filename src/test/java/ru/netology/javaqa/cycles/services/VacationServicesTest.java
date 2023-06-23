package ru.netology.javaqa.cycles.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServicesTest {
    @Test
    public void testVacation(){
        VacationServices services = new VacationServices();

        int expected = 9;
        int actual = services.calculate(10_000,3_000);
        //System.out.println(expected == actual);
        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void testVacation2() {
        VacationServices services = new VacationServices();

        int expected = 7;
        int actual = services.calculate(100_000,60_000);
        //System.out.println(expected==actual);
        Assertions.assertEquals(expected, actual);
    }
}
