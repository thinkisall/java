package accessModifier;

/**
 * BirthdayTest
 */
public class BirthdayTest {

    public static void main(String[] args) {
        Birthday date = new Birthday();
        date.setYear(2019);
        date.setMonth(12);
        date.setDay(31);

        date.showDate();
    }
}