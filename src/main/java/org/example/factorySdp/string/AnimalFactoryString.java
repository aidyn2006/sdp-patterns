package org.example.factorySdp.string;

import org.example.factorySdp.Animal;
import org.example.factorySdp.Bird;
import org.example.factorySdp.Cat;
import org.example.factorySdp.Dog;

public abstract class AnimalFactoryString {

    public static Animal createAnimal(String object) throws ClassNotFoundException {
        if(object.equalsIgnoreCase("cat")){
            return new Cat();
        }
        else if(object.equalsIgnoreCase("dog")){
            return new Dog();
        }
        else if(object.equalsIgnoreCase("bird")){
            return new Bird();
        }
        else {
            throw new ClassNotFoundException("error");
        }
    }
}
