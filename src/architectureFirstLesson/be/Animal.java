/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package architectureFirstLesson.be;

import architectureFirstLesson.bll.IAnimalActions;

/**
 *
 * @author Mathias
 */
public abstract class Animal implements IAnimalActions {

    /*Dette er styrken ved en abstract klasse, da interfaces ikke kan have fields.
      man kan, hvis man vil, også lave abstract metoder, for samme funktionalitet som interface. */
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
