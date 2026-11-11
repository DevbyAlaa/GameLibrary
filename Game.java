public class Game {
    private String title;
    private String genre;
    private double price;

    private static int totalGames = 0;

    public static final String STORE_NAME = "Pixel Store";

    public Game() {
        this("Unknown", "Uncategorized", 0.0);
    }

    public Game(String title, String genre, double price) {
        setTitle(title);
        setGenre(genre);
        setPrice(price);
        totalGames++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Title cannot be empty."
            );
        }

        this.title = title.trim();
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (genre == null || genre.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Genre cannot be empty."
            );
        }

        this.genre = genre.trim();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (!Double.isFinite(price) || price < 0) {
            throw new IllegalArgumentException(
                "Price must be a finite, non-negative number."
            );
        }

        this.price = price;
    }

    public static int getTotalGames() {
        return totalGames;
    }

    public String getInfo() {
        return "Title: " + title
            + "\nGenre: " + genre
            + "\nPrice: " + String.format(
                java.util.Locale.US, "%.2f SAR", price
            )
            + "\nStore: " + STORE_NAME;
    }
}
