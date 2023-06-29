package gabrielle.streaming.template;

import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {

//  @SerializedName("Title") //pode tirar porque tá usando record.
    private String title;
    private double sumOfRatings;
    private int totalRatings;
    private boolean includedOnSubscription;
//  @SerializedName("Year")
    private int releaseYear;
    private int length; //in minutes

//  constructors
    public Title(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.length = length;
    }
    public Title(String title, int releaseYear, int length){
        this.title = title;
        this.releaseYear = releaseYear;
        this.length = length;
    }

    public Title(TitleOMDB titleOMDB) {
         this.title = titleOMDB.title();
         this.releaseYear = Integer.valueOf(titleOMDB.year()); //conversão de string pra int
         this.length = Integer
                 .valueOf(titleOMDB.runtime().substring(0,3));
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getTitle().compareTo(otherTitle.getTitle());
    }

//    public interface Comparator {
//        int compare(Title firstTitle, Title secondTitle);
//    }

    @Override
    public String toString() {
        return this.getTitle() +" (" + this.getReleaseYear() + ")" + ", " + this.getLength();
    }

//  Movie Technical sheet
    public void showTechSheet(){
        System.out.println("Title: " + title);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Length: " + getLength() + " min");
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

//    getters and setters

//    public void setLength(int length) {
//        this.length = length;
//    }
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
//  OR
//  public void setTitle(String t) {
//      title = t;
//  }
    public void setIncludedOnSubscription(boolean i) {
        this.includedOnSubscription = i;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
}
