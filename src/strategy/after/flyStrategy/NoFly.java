package strategy.after.flyStrategy;

public class NoFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("cant fly");
    }
}
