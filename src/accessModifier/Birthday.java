package accessModifier;

public class Birthday {

    private int day;
    private int month;
    private int year;

    private boolean isValid;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        isValid = (day > 0 && day < 32 ? true : false);
        this.day = isValid ? day : 0;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < 1 || month > 12) {
            isValid = false;
        }else{
            isValid = true;
            this.month = month;
        }
    }
    

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        isValid = (year > 0 ? true : false);
        this.year = isValid ? year : 0;
    }

    public void showDate() {
        System.out.print(isValid ? year +"년 " + month +"월 "+day +"일" : "Invalid date");
    }
}
