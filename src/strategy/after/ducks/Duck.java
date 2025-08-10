package strategy.after.ducks;

import strategy.after.flyStrategy.FlyBehaviour;
import strategy.after.quackStrategy.QuackBehaviour;

public class Duck {
    public FlyBehaviour flyBehaviour;
    public QuackBehaviour quackBehaviour;

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void swim(){
        System.out.println("all ducks swim the same way");
    }
}
