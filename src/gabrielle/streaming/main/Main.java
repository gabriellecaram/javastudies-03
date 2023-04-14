package gabrielle.streaming.main;

import gabrielle.streaming.calculation.Recommendation;
import gabrielle.streaming.calculation.TimeCalculator;
import gabrielle.streaming.template.Episode;
import gabrielle.streaming.template.Movie;
import gabrielle.streaming.template.Series;

import java.util.ArrayList;

//Class 03 - Subject: classes and methods, encapsulation, access modifiers,
//importing packages, getters and setters, this, inheritance: subclasses and superclasses;
//annotations, interfaces, var, arraylist, Object class, toString, constructor, pointers 

//access modifiers: public, protected, private, default.
//shift + F6 = renames an element
//alt + insert = getters and setters
//cant use "var" without initial value

public class Main {
    public static void main(String[] args) {

        System.out.println("\n---------");
        Movie spiderman = new Movie("Spiderman", 2005, 140);
        spiderman.rating(10);
        spiderman.rating(9);
        spiderman.rating(10);
        spiderman.setIncludedOnSubscription(true);
        spiderman.showTechSheet();
        System.out.println("total rating: " + spiderman.getTotalRatings());

        System.out.println("\n---------");
        Series riverdale = new Series("Riverdale", 2017);
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
        Movie titanic = new Movie("Titanic",1998, 194);
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