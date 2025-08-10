package strategy.after.quackStrategy;

public class UglyQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("ugly quack");
    }
}
