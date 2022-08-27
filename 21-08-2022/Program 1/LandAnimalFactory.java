public class LandAnimalFactory extends AnimalFactory {
    @Override
    public IAnimal getAnimal(String animalType)
    {
        if(animalType == "Cat")
        {
            return new Cat();
        }
        else if(animalType == "Dog")
        {
            return new Dog();
        }
        else if(animalType == "Lion")
        {
            return new Lion();
        }
        else
        {
            System.out.println("Land Animal type not supported!!");
            return null;
        }
    }
}

