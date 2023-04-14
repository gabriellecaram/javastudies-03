package caram.gabrielle.streaming.template;

import caram.gabrielle.streaming.calculation.Rating;

import java.lang.reflect.Constructor;

public class Movie extends Title implements Rating {

    @Override
    public double getRating() {
        return average();
    }

//  Constructor
    public Movie(String title){
        this.setTitle(title);
    }


}