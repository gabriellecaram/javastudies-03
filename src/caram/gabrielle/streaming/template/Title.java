package caram.gabrielle.streaming.template;

public class Title {

    private String title;
    private double sumOfRatings;
    private int totalRatings;
    private boolean includedOnSubscription;
    private int releaseYear;
    private int length; //in minutes

    public void setLength(int length) {
        this.length = length;
    }
    public int getLength(){
        return this.length;
    }
    public String getTitle() {
        return title;
    }

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
    public void setIncludedOnSubscription(boolean i) {
        this.includedOnSubscription = i;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    //Movie Technical sheet
    public void showTechSheet(){
        System.out.println("Title: " + title);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Length: " + getLength());
        showAverage();
    }
    public void rating(double rate){
        sumOfRatings += rate;
        totalRatings++;
    }
    public double average(){
        return sumOfRatings/totalRatings;
    }
    public void showAverage(){
        System.out.printf("Average rate: %.1f\n", sumOfRatings/totalRatings);
    }
}
