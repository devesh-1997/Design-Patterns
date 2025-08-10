package strategy.before;

public class Driver {

    public static void main(String[] args){
        Duck duck = new Duck();
        duck.fly();

        Duck mallard = new MallardDuck();
        mallard.swim();
    }
}
