package wizytor;

import wizytor.activity.Activity;
import wizytor.activity.Squash;
import wizytor.activity.Treadmill;
import wizytor.activity.Weights;
import wizytor.visitor.VisitorImpl;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Treadmill treadmill = new Treadmill(200);
        Squash squash = new Squash(45);
        Weights weights = new Weights(50, 10);

        VisitorImpl visitor = new VisitorImpl();
        treadmill.accept(visitor);
        squash.accept(visitor);
        weights.accept(visitor);

        System.out.println("========================");

        List<Activity> activityList = Arrays.asList(treadmill, squash, weights);
        activityList.forEach(activity -> activity.accept(visitor));

    }
}
