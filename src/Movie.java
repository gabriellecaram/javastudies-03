//Class 03 - Subject: classes and methods

public class Movie {
    String title;
    double rate;
    boolean includedOnSubscription;
    int releaseYear;
    int movieLength; //in minutes
    //shift + F6 = renames an element

    //Technical sheet
    void showTechSheet(){
        System.out.println("Title: " + title);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Length: " + movieLength);
    }