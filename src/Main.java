import caram.gabrielle.streaming.template.Movie;

//Class 03 - Subject: classes and methods, encapsulation, access modifiers,
//importing packages, getters and setters, this
//access modifiers: public, protected, private, default.
//shift + F6 = renames an element

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setTitle("Pride and Prejudice");
        myMovie.setReleaseYear(2005);
        myMovie.setMovieLength(127);
        myMovie.setRate(8.7);
        myMovie.setIncludedOnSubscription(true);

        myMovie.showTechSheet();

        //myMovie.rating(10);
        //myMovie.rating(9);
        //myMovie.rating(8);

        System.out.println("Total ratings: " + myMovie.getTotalRatings());
        System.out.println("Movie average rating: " + myMovie.showAverage());

    }
}