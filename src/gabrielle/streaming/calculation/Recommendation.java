package gabrielle.streaming.calculation;

public class Recommendation {

    private String recommendation;

    public void filter(Rating rated){
        if(rated.getRating() >= 4) System.out.println("Very popular");
        else if (rated.getRating() >= 2 && rated.getRating() <4) System.out.println("Popular");
        else System.out.println("Not popular");
    }
}
