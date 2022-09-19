package DecoratorDesignPattern;

public class BasicCar implements ICar {
    @Override
    public void manufactureCar() {
        System.out.println("Manufacturing basic car.");
    }
}
