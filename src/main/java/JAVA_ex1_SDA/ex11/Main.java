package JAVA_ex1_SDA.ex11;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Cow cow = new Cow();
        Cat cat = new Cat();
        Dog dog = new Dog();

        List<Animal> animalSounds = new ArrayList<>();
        animalSounds.add(cow);
        animalSounds.add(cat);
        animalSounds.add(dog);

        for (Animal animals:animalSounds){
            System.out.println(animals.makeSound());
        }
    }
}
