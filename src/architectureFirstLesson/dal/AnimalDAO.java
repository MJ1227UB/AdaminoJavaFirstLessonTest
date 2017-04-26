/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package architectureFirstLesson.dal;

import architectureFirstLesson.be.Animal;
import architectureFirstLesson.be.Cat;
import architectureFirstLesson.be.Dog;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mathias
 */
public class AnimalDAO {

    private final List<Animal> listOfAnimals;

    public AnimalDAO() {
        listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Dog("Doge"));
        listOfAnimals.add(new Dog("Fido"));
        listOfAnimals.add(new Cat("Pussy"));
        listOfAnimals.add(new Cat("Whatever"));
    }

    public List<Animal> getlistAnimals() {
        return new ArrayList<>(listOfAnimals);
    }

}
