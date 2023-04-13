package caram.gabrielle.streaming.template;

import caram.gabrielle.streaming.calculation.Rating;

public class Movie extends Title implements Rating {

    @Override
    public double getRating() {
        return average();
    }
}