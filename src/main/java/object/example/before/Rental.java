package object.example.before;

public class Rental {
    private Movie movie;
    private int daysRented;


    // 이 메소드가 중점
    public int getFrequentRenterPoints() {
        // 데이터를 달라고 하는 부분
        if (movie.getPriceCode() == Movie.NEW_RELEASE && daysRented > 1) {
            return 2;
        } else {
            return 1;
        }
    }

}

class Movie {
    public static int REGULAR = 0;
    public static int NEW_RELEASE = 1;
    private int priceCode;


    public int getPriceCode() {
        return priceCode;
    }
}
