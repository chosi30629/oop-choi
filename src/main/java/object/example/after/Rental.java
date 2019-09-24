package object.example.after;

public class Rental {
    private Movie movie;
    private int daysRented;


    // 객체에서 판단 후 리턴
    public int getFrequentRenterPoints() {
       return movie.getFrequentRenterPoints(daysRented);
    }

}

class Movie {
    public static int REGULAR = 0;
    public static int NEW_RELEASE = 1;
    private int priceCode;


    public int getPriceCode() {
        return priceCode;
    }

    public int getFrequentRenterPoints(int daysRented) {
        if (priceCode == NEW_RELEASE && daysRented > 1) {
            return 2;
        }
        return 1;
    }
}
