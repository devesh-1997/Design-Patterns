package strategy.after.ducks;

import strategy.after.flyStrategy.FlyWithWings;
import strategy.after.quackStrategy.CuteQuack;

public class Mallard extends Duck {
    public Mallard(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new CuteQuack();
    }
}
