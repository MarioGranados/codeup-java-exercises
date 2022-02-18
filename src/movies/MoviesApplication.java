package movies;

import java.util.Scanner;

public class MoviesApplication {

    static void displayMovies(Movie[] movie) {
        for (Movie value : movie) {
            System.out.println(value.getMovieName() + "--" + value.getCategory());
        }
    }

    static void filterMovies(String searchInput) {
        Movie[] movie = new Movie[MoviesArray.findAll().length];
        for (int i = 0; i < MoviesArray.findAll().length; i++) {
            if (MoviesArray.findAll()[i].getCategory().equals(searchInput)) {
                movie[i] = MoviesArray.findAll()[i];
                System.out.println("movie name: " + movie[i].getMovieName() + "--" + movie[i].getCategory());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("What would you like to do?");
        System.out.println("" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category"
        );
        System.out.println("Enter your choice");
        Scanner in = new Scanner(System.in);
        int userInput = in.nextInt();
        Movie[] movie = MoviesArray.findAll();
        switch (userInput) {
            case 0:
                System.out.println("good-bye");
                break;
            case 1:
                displayMovies(movie);
                break;
            case 2:
                filterMovies("animated");
                break;
            case 3:
                filterMovies("drama");
                break;
            case 4:
                filterMovies("horror");
                break;
            case 5:
                filterMovies("scifi");
                break;
            default:
                System.out.println("That Selection isn't here");

        }

    }
}
