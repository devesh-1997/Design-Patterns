package strategy.before;

public class RubberDuck extends Duck{
    //for every duck that cannot fly or has different behaviour from superclass, we need to override
    @Override
    public void fly(){
        System.out.println("cannot fly");
    }
}
