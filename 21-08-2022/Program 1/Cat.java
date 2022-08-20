public class Cat implements IAnimal {
    @Override
    public String speak() {
        return "Meow";
    }

    @Override
    public String type() {
        return "Cat";
    }
}
