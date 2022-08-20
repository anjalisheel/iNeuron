public class Program {
    public static void main(String[] args) {
        printDetails("abc", "xyz");
        printDetails("Land", "Lion");
        printDetails("Land", "Dog");
        printDetails("Land", "Cat");
        printDetails("Sea", "Octopus");
        printDetails("Sea", "Shark");
    }

    private static void printDetails(String factoryType, String animalType) {
        AnimalFactory animalFactory = AnimalFactory.createAnimalFactory(factoryType);

        IAnimal animal;
        if(animalFactory != null)
        {
            animal = animalFactory.getAnimal(animalType);
            {
                if(animal != null)
                {
                    System.out.println("Animal factory type : " + animal.type());
                    System.out.println("Animal speak : " + animal.speak());
                }
            }
        }
        System.out.println();
    }
}