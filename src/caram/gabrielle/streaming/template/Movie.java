package caram.gabrielle.streaming.template;

public class Movie {

    private String title;
    private double rate;
    private double sumOfRatings;
    private int totalRatings;
    private boolean includedOnSubscription;
    private int releaseYear;
    private int movieLength; //in minutes


    public int getTotalRatings(){
        return totalRatings;
    }
    public void setTitle(String title) {
        this.title = title; //this. refers to the attribute in this class
    }
    /*
    OR
    public void setTitle(String t) {
        title = t;
    }
    */
    public void setRate(double rate) {
        this.rate = rate;
    }
    public void setIncludedOnSubscription(boolean includedOnSubscription) {
        this.includedOnSubscription = includedOnSubscription;
    }
    public void setMovieLength(int movieLength) {
        this.movieLength = movieLength;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    //Movie Technical sheet
    public void showTechSheet(){
        System.out.println("Title: " + title);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Length: " + movieLength);
    }
    public void rating(double rate){
        sumOfRatings += rate;
        totalRatings++;
    }
    public double showAverage(){
        return sumOfRatings/totalRatings;
    }
}