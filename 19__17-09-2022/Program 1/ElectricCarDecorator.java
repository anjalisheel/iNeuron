package DecoratorDesignPattern;

public class ElectricCarDecorator extends CarDecorator {
    public ElectricCarDecorator(ICar car) {
        super(car);
    }

    @Override
    public void manufactureCar() {
        //first basic car will be created
        super.manufactureCar();
        System.out.println("Including the features of electric car.");
    }
}
