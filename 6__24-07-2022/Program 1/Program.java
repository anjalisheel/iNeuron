public class Program {
    public static void main(String[] args) {
        //this works perfectly fine
        ICat cat = new PetCat();
        cat.drinkMilk();
        cat.makeSound();

        ICat toyCat = new ToyCat();
        toyCat.makeSound();
        toyCat.drinkMilk();
    }
}