package Array;

public class BookTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        for(int i=0; i<library.length; i++){
            library[i] = new Book("제목"+i, "저자"+i);
        }

        for(Book book : library){
            book.showInfo();
        }


    }

    
    
}
