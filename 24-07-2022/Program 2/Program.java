public class Program {
    public static void main(String[] args) {
        System.out.println("For pet cat:");
        ILivingCat cat = new PetCat();
        cat.drinkMilk();
        cat.makeSound();
        System.out.println();

        System.out.println("For toy cat:");
        IMechanicalCat toyCat = new ToyCat();
        toyCat.makeSound();
    }
}