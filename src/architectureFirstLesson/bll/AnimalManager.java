/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package architectureFirstLesson.bll;

import architectureFirstLesson.be.Animal;
import architectureFirstLesson.dal.AnimalDAO;
import java.util.List;

/**
 *
 * @author Mathias
 */
public class AnimalManager {

    private AnimalDAO animalDAO;

    public AnimalManager() {
        animalDAO = new AnimalDAO();
    }

    public List<Animal> getlistAnimals() {
        return animalDAO.getlistAnimals();
    }
}
