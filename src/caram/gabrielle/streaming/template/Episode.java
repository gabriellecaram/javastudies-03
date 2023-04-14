package caram.gabrielle.streaming.template;
import caram.gabrielle.streaming.calculation.Rating;
import caram.gabrielle.streaming.calculation.Recommendation;

public class Episode extends Recommendation implements Rating {
    private int number;
    private String name;
    private Series series;
    private int totalViews;
    private int length;

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getTotalViews() {
        return totalViews;
    }
    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Series getSeries() {
        return series;
    }
    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public double getRating() { //crazy rating rule to differ from the one described in Movie class
        if(totalViews>100) return 4;
        else return 2;
    }

    public void showTechSheet(){
        System.out.println("Episode " + getNumber() + ": " + getName());
        System.out.println("Views: " + getTotalViews());
        System.out.println("Rating: " + getRating() + " stars");
        System.out.println("Duration: " + getLength() +" min");
    }
}
