package CopyOverriding;

public class SummaryVariable {
    
    int 인스턴스변수;
    String 인스턴스변수는="heap에 쌓입니다.";
    
    static int 클래스변수;
    static String 클래스변수는="프로그램이 종료되기전까지 메모리에 남아있어요";

    static void bbb(){
        String 참조변수지만함수안에써서지역변수 = "변수";
        System.out.println(참조변수지만함수안에써서지역변수);
    }

    void 인스턴스메서드(){
        int 인스턴스안에지역변수 = 1;
        String 스트링은참조인데어디에쌓일까 = "어딜까";
        System.out.println("인스턴스안에 지역변수는 stack에 쌓임");
        System.out.println("놀랍게도 Stack에 쌓임 지역변수라서!");
        System.out.println(인스턴스안에지역변수+스트링은참조인데어디에쌓일까);
    }

    static void 클래스메서드(){
        System.out.println("Array나 Math같은 라이브러리들이 이걸로 만들어짐");
    }

    public static void main(String[] args) {
        String args는뭘까 = "매개변수로써 지역변수에 해당";
       SummaryVariable t1 = new SummaryVariable();
        System.out.println("t1은 지역변수 물론 t2도");
        t1.인스턴스메서드();
       SummaryVariable t2 = new SummaryVariable();
        t2.인스턴스메서드();

        System.out.println(args는뭘까);
    }

}
