public class Program {

    public static void main(String[] args) {
        AnimalFeeder animalFeeder = new AnimalFeeder();
        animalFeeder.feedAnimal(new Dog());
        animalFeeder.feedAnimal(new Cat());
        animalFeeder.feedAnimal(new Tiger());
    }
}