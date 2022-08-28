public abstract class AnimalFactory {
    public abstract IAnimal getAnimal(String animalType);

    public static AnimalFactory createAnimalFactory(String factoryType)
    {
        if(factoryType == "Sea")
        {
            return new SeaAnimalFactory();
        }
        else if(factoryType == "Land")
        {
            return new LandAnimalFactory();
        }
        else
        {
            System.out.println("Factory not supported!!");
            return null;
        }
    }
}
