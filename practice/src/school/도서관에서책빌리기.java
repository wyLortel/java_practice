package school;

import java.util.ArrayList;

class 학생{
    String name;
    int age;
    책 book;

    public void 학생이도서관에서책빌리기(String title){
        for (책 book : 도서관.books) {

            if(book.nameGet().equals(title)){
                System.out.println("책 빌렷어용");
                this.book = book;
            }else {
                System.out.println("안돼용");
            }
        }
    }


}

class 도서관 {
    static ArrayList<책> books = new ArrayList<>();

    public void addBook(String title, String author) {
        books.add(new 책(title, author));
    }


}

class 책 {
    String name;
    String author;

    public 책( String book , String author) {
        this.name = book;
        this.author = author;

    }

    public String nameGet(){
        return name;
    }


}


public class 도서관에서책빌리기 {
    public static void main(String[] args) {
        학생 s = new 학생();
        도서관 lib = new 도서관();
        lib.addBook("데미안" , "이근욱");
        s.학생이도서관에서책빌리기("데미안");
    }
}
