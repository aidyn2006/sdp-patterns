package org.example.factorySdp;

import org.example.factorySdp.string.AnimalFactoryString;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        AnimalFactory animalFactory=new BirdFactory();
        Animal bird=animalFactory.createAnimal();
        bird.speak();

        AnimalFactory animalFactory1= new CatFactory();
        Animal cat=animalFactory1.createAnimal();
        cat.speak();

        AnimalFactory animalFactory2=new DogFactory();
        Animal dog=animalFactory2.createAnimal();
        dog.speak();

        /**
         * createObject with String
         */
        Animal animal=AnimalFactoryString.createAnimal("dog");
        animal.speak();

        Animal animal1=AnimalFactoryString.createAnimal("cat");
        animal1.speak();

        Animal animal2=AnimalFactoryString.createAnimal("bird");
        animal2.speak();
    }
}
