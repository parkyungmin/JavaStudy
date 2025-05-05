package mid2.generic.ex2;

import mid2.generic.animal.Animal;
import mid2.generic.animal.Cat;
import mid2.generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        Box<Animal> animalBoxBox = new Box<>();
        animalBoxBox.set(animal);
        animalBoxBox.set(dog);
        animalBoxBox.set(cat);

        Animal findAnimal = animalBoxBox.get();
        System.out.println("findDog = " + findAnimal);

    }
}
