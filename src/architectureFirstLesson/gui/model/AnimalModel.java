/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package architectureFirstLesson.gui.model;

import architectureFirstLesson.be.Animal;
import architectureFirstLesson.bll.AnimalManager;
import java.util.List;

/**
 *
 * @author Mathias
 */
public class AnimalModel {

    private AnimalManager animalManager;
    private List<Animal> listOfAnimals;

    public AnimalModel() {
        animalManager = new AnimalManager();
        listOfAnimals = animalManager.getlistAnimals();
    }
}
