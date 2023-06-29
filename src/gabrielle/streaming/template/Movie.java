package gabrielle.streaming.template;

import gabrielle.streaming.calculation.Rating;

public class Movie extends Title implements Rating {

    @Override
    public double getRating() {
        return average();
    }

//    Constructor
//    a constructor sets some attributes when the object is instantiated.
//    inheritance doesn't work for constructors
    public Movie(String title, int releaseYear, int length){
        super(title, releaseYear, length);
    }

}