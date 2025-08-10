package strategy.after;

import strategy.after.ducks.Duck;
import strategy.after.ducks.Mallard;
import strategy.after.ducks.RubberDuck;

public class Driver {

    public static void main(String[] args) {

        Duck rubberDuckie = new RubberDuck();
        Duck mallard = new Mallard();

        System.out.println("rubber duck behaviours:");
        rubberDuckie.performFly();
        rubberDuckie.performQuack();

        System.out.println("mallard behaviours:");
        mallard.performFly();
        mallard.performQuack();
    }

}
