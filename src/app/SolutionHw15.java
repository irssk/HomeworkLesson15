package app;

import app.models.Day;
import app.models.Recommendation;

public class SolutionHw15 {
    public static void main(String[] args) {
        Recommendation recommendation = new Recommendation();

        for (Day day : Day.values()) {
            System.out.print(day + ": ");
            recommendation.advise(day);
        }
    }
}