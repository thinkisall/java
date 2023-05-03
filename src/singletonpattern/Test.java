package singletonpattern;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        Company company = Company.getInstance();
        Company company2 = Company.getInstance();
        System.out.println(company);
        System.out.println(company2);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

    }
}
