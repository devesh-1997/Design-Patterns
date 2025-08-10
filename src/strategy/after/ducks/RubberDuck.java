package strategy.after.ducks;

import strategy.after.flyStrategy.NoFly;
import strategy.after.quackStrategy.CuteQuack;

public class RubberDuck extends Duck{
    public RubberDuck(){
        flyBehaviour = new NoFly();
        quackBehaviour = new CuteQuack();
    }
}
