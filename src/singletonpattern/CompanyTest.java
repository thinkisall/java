package singletonpattern;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {
        
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);

        // 불러진 인스턴스의 주소값이 둘다 동일

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
    }
}
