import caram.gabrielle.streaming.calculation.Recommendation;
import caram.gabrielle.streaming.calculation.TimeCalculator;
import caram.gabrielle.streaming.template.Episode;
import caram.gabrielle.streaming.template.Movie;
import caram.gabrielle.streaming.template.Series;

import java.util.ArrayList;

//Class 03 - Subject: classes and methods, encapsulation, access modifiers,
//importing packages, getters and setters, this, inheritance: subclasses and superclasses;
//annotations, interfaces, var, arraylist, Object class, toString, constructor
//access modifiers: public, protected, private, default.
//shift + F6 = renames an element
//alt + insert = getters and setters
//cant use "var" without initial value

public class Main {
    public static void main(String[] args) {

        System.out.println("\n---------");
        Movie spiderman = new Movie("Spiderman");
        spiderman.setReleaseYear(2005);
        spiderman.setLength(127);
        spiderman.rating(10);
        spiderman.rating(9);
        spiderman.rating(10);
        spiderman.setIncludedOnSubscription(true);
        spiderman.showTechSheet();

        System.out.println("\n---------");
        Series riverdale = new Series();
        riverdale.setTitle("Riverdale");
        riverdale.setReleaseYear(2017);
        riverdale.setFinished(true);
        riverdale.setIncludedOnSubscription(true);
        riverdale.setSeasons(7);
        riverdale.setEpisodes(76);
        riverdale.setEpisodesLength(60);
        riverdale.rating(10);
        riverdale.rating(7);
        riverdale.rating(8.2);
        riverdale.showTechSheet();

        System.out.println("\n---------");
        System.out.println("Time Calculator:");
        TimeCalculator timeCalculator = new TimeCalculator();
        timeCalculator.includes(spiderman);
        timeCalculator.includes(riverdale);
        //System.out.println(timeCalculator.getTotalTime());
        timeCalculator.showTotalTime();


        System.out.println("\n---------");
        Episode episode1 = new Episode();
        Recommendation recommendation = new Recommendation();
        episode1.setNumber(1);
        episode1.setName("Pilot");
        episode1.setSeries(riverdale);
        episode1.setTotalViews(1000);
        episode1.setLength(55);
        episode1.showTechSheet();
        recommendation.filter(episode1);

        System.out.println("\n---------");
        Movie titanic = new Movie("Titanic");
        titanic.setTitle("Titanic");
        titanic.setLength(194);
        titanic.setReleaseYear(1998);
        titanic.setIncludedOnSubscription(true);
        titanic.rating(10);
        titanic.showTechSheet();

        System.out.println("\n---------");
//        var moviesList = new ArrayList<Movie>();
        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(titanic);
        moviesList.add(spiderman);
        System.out.println("List size: " + moviesList.size());
        System.out.println("1st movie: " + moviesList.get(0).getTitle());

        System.out.println(moviesList);
    }
}