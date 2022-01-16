package firstpattern;

public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void peformFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
