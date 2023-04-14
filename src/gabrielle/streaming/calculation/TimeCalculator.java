package gabrielle.streaming.calculation;

import gabrielle.streaming.template.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

//    public void includes(Movie m){
//        totalTime += m.getLength();
//    }
//
//    public void includes(Series s){
//        totalTime += s.getLength();
//    }

    //calculates how long it will take to watch a list of titles.
    public void includes(Title t){
        System.out.println(t.getTitle() + " added to the list");
        this.totalTime += t.getLength();
    }
    public void showTotalTime(){
        System.out.println("Time needed: " + totalTime +" min");
    }
}
