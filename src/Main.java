import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Lion", 500, "Jungle", true);
        Animal cow = new Animal("Cow", 1000, "Field", false);
        Animal sloth = new Animal("Sloth", 100, "Trees", true);

        Animal[] zoo = {lion, cow, sloth};

        for (Animal animal : zoo) {
            animal.feed();
            animal.makeSound();
            System.out.println(animal.toString());
            System.out.println();
        }

        for (int i = 0; i < zoo.length; i++) {
            Animal animal = zoo[i];
            System.out.println("Putting " + animal.getSpecies() + " back into the zoo.");
        }
    }
}

