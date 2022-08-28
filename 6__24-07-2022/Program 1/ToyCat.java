public class ToyCat implements ICat {
    @Override
    public void drinkMilk() {
        throw new RuntimeException("I don't drink milk");
    }

    @Override
    public void makeSound() {
        System.out.println("Makes mechanical meow sound.");
    }
}
