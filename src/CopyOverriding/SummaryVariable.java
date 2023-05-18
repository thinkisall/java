package CopyOverriding;

public class SummaryVariable {
    
    static String 클래스변수="클래스 전체에서 사용가능한 변수";
    
    String 인스턴스변수혹은필드="인스턴스 변수. heap에 쌓임.";

    static void 클래스메서드(){
        String 지역변수 = "변수";
    }

    void 메서드(){
        int 지역변수 = 1;
        System.out.println("지역변수는 메서드가 호출되면 stack에 같이 올라간다.");
    }


    public static void main(String[] args) {
        System.out.println("Main메서드는 entrypoint 클래스");
        String args는뭘까 = "매개변수로써 지역변수에 해당";

       SummaryVariable t1 = new SummaryVariable();
       SummaryVariable t2 = new SummaryVariable();
       
       System.out.println("t1,t2는 지역변수");
       System.out.println("생성자또한 메서드이기때문에 똑같이 메서드영역에 잡힌다.");
       System.out.println("호출될때는 생성자가 호출되고 stack에 변수는 올라가고 값은 heap으로 적용");
       t1.메서드();
       t2.메서드();

       System.out.println(args는뭘까);
    }

}
