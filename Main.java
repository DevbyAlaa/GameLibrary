public class Main {
    public static void main(String[] args) {
        Game game1 = new Game(
            "Red Dead Redemption 2",
            "Action Adventure",
            150.0
        );

        Game game2 = new Game(
            "Minecraft",
            "Sandbox",
            100.0
        );

        Game game3 = new Game();

        game3.setTitle("Stardew Valley");
        game3.setGenre("Simulation");
        game3.setPrice(50.0);

        Game[] games = {
            game1,
            game2,
            game3
        };

        System.out.println("GAME LIBRARY");
        System.out.println("====================");

        for (Game game : games) {
            System.out.println(game.getInfo());
            System.out.println("--------------------");
        }

        game1.setPrice(120.0);

        System.out.println("UPDATED PRICE");
        System.out.println(game1.getInfo());

        System.out.println(
            "\nSelected game: " + game2.getTitle()
        );

        System.out.println(
            "Genre: " + game2.getGenre()
        );

        System.out.printf(
            java.util.Locale.US,
            "Price: %.2f SAR%n",
            game2.getPrice()
        );

        System.out.println(
            "\nTotal games: " + Game.getTotalGames()
        );
    }
}
