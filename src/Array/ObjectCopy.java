package Array;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        
        for(int i=0; i<library.length; i++){
            library[i] = new Book("여기제목","여기글쓴이");
            copyLibrary[i] = new Book();
        }

        for(int i=0; i<library.length; i++){
            copyLibrary[i].setTitle(library[i].getTitle());
            copyLibrary[i].setAuthor(library[i].getAuthor());
        }


        for(Book book : library){
            System.out.println(book);
        }

        for(Book book : copyLibrary){
            System.out.println(book);
        }
        
    }
    
        
    
}
