package strategy.after.quackStrategy;

public class CuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("cute quack");
    }
}
