import caram.gabrielle.streaming.calculation.TimeCalculator;
import caram.gabrielle.streaming.template.Movie;
import caram.gabrielle.streaming.template.Series;

//Class 03 - Subject: classes and methods, encapsulation, access modifiers,
//importing packages, getters and setters, this, inheritance: subclasses and superclasses; annotations
//access modifiers: public, protected, private, default.
//shift + F6 = renames an element
//alt + insert = getters and setters

public class Main {
    public static void main(String[] args) {

        System.out.println("\n---------");
        Movie spiderman = new Movie();
        spiderman.setTitle("Spiderman");
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

    }
}