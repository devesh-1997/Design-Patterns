package strategy.before;

public class Duck {

    //varies across children
    public void quack(){
        System.out.println("quack");
    }


    //varies across children
    public void fly() {
        System.out.println("fly");
    }

    //common behaviour across children
    public void swim() {
        System.out.println("swim");
    }
}
