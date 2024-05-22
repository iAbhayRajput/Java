import java.util.Arrays;

enum GameGenre {
    ACTION,
    ADVENTURE,
    RPG,
    STRATEGY
}

class GameLibrary<T> {
    private T[] games;

    GameLibrary(T[] games) {
        this.games = games;
    }

    public void addGame(T game) {
        T[] newGames = Arrays.copyOf(games, games.length + 1);
        newGames[games.length] = game;
        games = newGames;
    }

    public void displayGames() {
        System.out.println("Games in the library:");
        for (T game : games) {
            System.out.println(game);
        }
    }
}

class Game {
    private String title;
    private GameGenre genre;
    private Integer rating;

    Game(String title, GameGenre genre, Integer rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public String toString() {
        return "Title: " + title + ", Genre: " + genre + ", Rating: " + rating;
    }
}

public class GameHandler {
    public static void main(String[] args) {
        Game game1 = new Game("The Witcher 3", GameGenre.RPG, 98);
        Game game2 = new Game("Civilization VI", GameGenre.STRATEGY, 88);
        Game game3 = new Game("Uncharted 4", GameGenre.ACTION, 92);

        GameLibrary<Game> gameLibrary = new GameLibrary<>(new Game[] {game1, game2});
        gameLibrary.addGame(game3);
        gameLibrary.displayGames();
    }
}
