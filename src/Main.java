public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.title = "Pride and Prejudice";
        myMovie.releaseYear = 2005;
        myMovie.movieLength = 127;
        myMovie.rate = 8.7;
        myMovie.includedOnSubscription = true;

        myMovie.showTechSheet()     ;

    }
}