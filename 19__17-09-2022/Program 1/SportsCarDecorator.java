package DecoratorDesignPattern;

public class SportsCarDecorator extends CarDecorator {
    public SportsCarDecorator(ICar car) {
        super(car);
    }

    @Override
    public void manufactureCar() {
        //first basic car will be created
        super.manufactureCar();
        System.out.println("Including the features of sports car.");
    }
}
