public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal_1 = animalFactory.getAnimal("feline");
        System.out.println(animal_1 + " sound " + animal_1.makeSound());

        Animal animal_2 = animalFactory.getAnimal("canine");
        System.out.println(animal_2 + " sound " + animal_2.makeSound());

    }
}
