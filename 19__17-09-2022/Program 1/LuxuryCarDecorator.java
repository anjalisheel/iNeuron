package DecoratorDesignPattern;

public class LuxuryCarDecorator extends CarDecorator {
    public LuxuryCarDecorator(ICar car) {
        super(car);
    }

    @Override
    public void manufactureCar() {
        //first basic car will be created
        super.manufactureCar();
        System.out.println("Including the features of luxury car.");
    }
}
