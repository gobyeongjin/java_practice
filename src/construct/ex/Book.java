package construct.ex;

public class Book {
    String Title;
    String author;
    int page;

    Book() {
        this("", "", 0);
    }

    Book(String Title, String author) {
        this(Title, author, 0);
    }

    Book(String Title, String author, int page) {
        this.Title = Title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("제목:" + Title + ",작가:" + author + ",페이지:" + page);
    }

}
