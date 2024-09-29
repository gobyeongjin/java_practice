package extends1.ex;

public class ShopMain {
    public static void main(String[] args) {
        // 객체 생성
        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("앨범1", 15000, "seo");
        Movie movie = new Movie("영화1", 18000, "감독1", "배우1");

        // 메서드 호출
        book.print();
        album.print();
        movie.print();

        // 가격 합계 계산 및 출력
        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격 합계: " + sum);
    }
}
