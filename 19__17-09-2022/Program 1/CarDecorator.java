package DecoratorDesignPattern;

//Basic car decorator
public class CarDecorator implements ICar {

    protected ICar car;

    public CarDecorator(ICar car) {
        this.car = car;
    }

    @Override
    public void manufactureCar() {
        this.car.manufactureCar();
    }
}
