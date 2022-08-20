public class SeaAnimalFactory extends AnimalFactory {
    @Override
    public IAnimal getAnimal(String animalType) {
        if(animalType == "Shark")
        {
            return new Shark();
        }
        else if(animalType == "Octopus")
        {
            return new Octopus();
        }
        else
        {
            System.out.println("Sea Animal type not supported!!");
            return null;
        }
    }
}
