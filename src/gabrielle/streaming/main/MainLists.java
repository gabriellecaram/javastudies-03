package gabrielle.streaming.main;

import gabrielle.streaming.template.Movie;
import gabrielle.streaming.template.Series;
import gabrielle.streaming.template.Title;

import java.util.*;


// ArrayList: dinamic array
// LinkedList: w pointers ->
// Stack: pile: last-in, first-out
// Map: interface that associates keys to values (used to searches, updates and elements recovery by keys)
// Hashmap: class that implements Map interface using a hash table to store key-value pairs. time complexity: O(1).

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
        //cria um array pra colocar todos os títulos
        List<Title> listWatchedTitles = new LinkedList<>(); //replaced array list for linkedlist
        listWatchedTitles.add(titanic);
        listWatchedTitles.add(spiderman);
        listWatchedTitles.add(riverdale);

        for(Title item: listWatchedTitles){
            System.out.println(item.getTitle());
            if(item instanceof Series){
                System.out.println("Seasons: " + ((Series) item).getSeasons());
            }
            item.showAverage();
            System.out.println();
        }
        System.out.println();


        //---------ordenação de arrays---------------------
        System.out.println("Titles ordered by name: ");
        Collections.sort(listWatchedTitles);
        System.out.println(listWatchedTitles);

        System.out.println("Titles ordered by release year: ");
        listWatchedTitles.sort(Comparator.comparing(Title::getReleaseYear)); //comparator
        System.out.println(listWatchedTitles);



    }
}
