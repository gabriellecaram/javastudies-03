package gabrielle.streaming.main;

import gabrielle.streaming.template.Movie;
import gabrielle.streaming.template.Series;
import gabrielle.streaming.template.Title;

import java.util.ArrayList;

public class MainLists {
    public static void main(String[] args) {

        Movie spiderman = new Movie("Spiderman", 2005, 140);
        spiderman.rating(9.6);
        spiderman.rating(10);
        Series riverdale = new Series("Riverdale", 2017);
        riverdale.rating(9);
        riverdale.setSeasons(7);
        Movie titanic = new Movie("Titanic",1998, 194);
        titanic.rating(10);

        Movie movie1 = titanic; //its not a copy of titanic, its a pointer -> to titanic.
        
        System.out.println("\n---------");
        ArrayList<Title> listWatchedTitles = new ArrayList<>();
        listWatchedTitles.add(titanic);
        listWatchedTitles.add(spiderman);
        listWatchedTitles.add(riverdale);

        for(Title item: listWatchedTitles){
            System.out.println(item.getTitle());
            if(item instanceof Series){
                System.out.println("Seasons: " + ((Series) item).getSeasons());
            }
            item.showAverage();
            System.out.println("\n");
        }

    }
}
