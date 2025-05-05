package mid2.generic.ex2;

import mid2.generic.animal.Animal;
import mid2.generic.animal.Cat;
import mid2.generic.animal.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        Dog findDog = dogBox.get();
        System.out.println("findDog = " + findDog);

        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        Cat findCat = catBox.get();
        System.out.println("findDog = " + findCat);

        Box<Animal> animalBoxBox = new Box<>();
        animalBoxBox.set(animal);
        Animal findAnimal = animalBoxBox.get();
        System.out.println("findDog = " + findAnimal);

    }
}
