package ru.netology.javaqa;

import ru.netology.javaqa.cycles.services.VacationServices;

public class Main {
    public static void main(String[] args) {
        VacationServices services = new VacationServices();

        int count = services.calculate(10_000, 3_000);
        System.out.println(count);

        int count1 = services.calculate(100_000,60_000);
        System.out.println(count1);
    }

}