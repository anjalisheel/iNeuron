package DecoratorDesignPattern;

public class Program {
    public static void main(String[] args) {
        //Demand for sports car
        ICar sportsCar = new SportsCarDecorator(new BasicCar());
        sportsCar.manufactureCar();
        System.out.println();

        //Demand for electric car
        ICar electricCar = new ElectricCarDecorator(new BasicCar());
        electricCar.manufactureCar();
        System.out.println();

        //Demand for sports electric car
        ICar sportsElectricCar = new ElectricCarDecorator(new SportsCarDecorator(new BasicCar()));
        sportsElectricCar.manufactureCar();
        System.out.println();

        //Demand for luxury sports electric car
        ICar luxurySportsElectricCar = new ElectricCarDecorator(new SportsCarDecorator(new LuxuryCarDecorator(new BasicCar())));
        luxurySportsElectricCar.manufactureCar();
    }
}