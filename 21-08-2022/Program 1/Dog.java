public class Dog implements IAnimal {
    @Override
    public String speak() {
        return "Bark";
    }

    @Override
    public String type() {
        return "Dog";
    }
}
