package 추상클래스;

public class Desktop extends Computer {

    @Override
    void display() {
        System.out.println("데스크탑 화면이 켜짐");
    }

    @Override
    void typing() {
        System.out.println("데스크탑 글씨가 쳐진다");
    }


}
