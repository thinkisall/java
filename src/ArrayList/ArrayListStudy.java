package ArrayList;

import java.util.ArrayList;
import Array.Book;

public class ArrayListStudy {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        // <> = 제네릭 어떤 객체를 넣을껀지 , 뒤에는 안써도 같이 적용됨 생략되어있는거임
        list.add(new Book("안녕하세요", "김상현"));
        list.add(new Book("안녕못해요", "김중현"));
        
        for(int i=0; i<list.size(); i++) {
            list.get(i).showInfo();
        }

        for(Book book : list){
            book.showInfo();
        }
    }
}
