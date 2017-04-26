/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaminojavafirstlessontest;

import java.util.ArrayList;
import java.util.List;

public class FirstLesson {

    //Create field to hold studentFirstName, initialize it to your first name
    //Create field to hold the value isLearning, initialize it to true
    //Create field to hold an int called currentSemester, initialize it to 2
    //Create a public constant field to hold a name called TEACHER, initialize to Adam
    private String studentFirstName;
    private boolean isLearning;
    private int currentSemester;
    public static final String TEACHER = "Adam";
    private int[] arrayOfSemesters;
    private List<Integer> arrayListOfSemesters;

    public FirstLesson() {
        studentFirstName = "Mathias";
        isLearning = true;
        currentSemester = 2;
        arrayOfSemesters = new int[]{1, 2, 3, 4, 5};
        arrayListOfSemesters = new ArrayList<>();
        addNumbersToArrayList();
    }

    private void addNumbersToArrayList() {
        for (int arrayOfSemester : arrayOfSemesters) {
            arrayListOfSemesters.add(arrayOfSemester);
        }
    }

    //Create a constructor which can studentFirstName as argument and sets the value of isLearning to false and currentSemester to 1
    public FirstLesson(String studentFirstName) {
        this.studentFirstName = studentFirstName;
        isLearning = false;
        currentSemester = 1;
        arrayListOfSemesters = new ArrayList<>();
        addNumbersToArrayList();
    }

    //Create a method to print studentName to the console called printStudentName
    public void printStudentName() {
        System.out.println(studentFirstName);
    }

    //Create a method to print studentName if the value isLearning is true, call it printLearningStudent
    public void printLearningStudent() {
        if (isLearning) {
            printLearningStudent();
        }
    }

    /*Create a method that takes an int "semester" as argument
    and returns studentName in case the int equals 2 and returns an empty value in case semester is 1, 3, 4, 5 or default
    Call it returnOnSecondSemester
     */
    public String returnOnSecondSemester(int semester) {
        if (semester == 2) {
            return studentFirstName;
        } else {
            return "";
        }
    }

    /*Create an int Array field which contains numbers from 1 to 5,
    call it arrayOfSemesters
    remember to create a getter for it afterwards!
     */
    public int[] getArrayOfSemesters() {
        return arrayOfSemesters;
    }

    /*Create an Integer ArrayList field that also contains the numbers from 1 to 5,
    call it arrayListOfSemesters
    remember to create a getter for it afterwards
     */
    public List<Integer> getArrayListOfSemesters() {
        return arrayListOfSemesters;
    }

    //Create a method to set the value isLearning to a new value
    public void setIsLearning(boolean isLearning) {
        this.isLearning = isLearning;
    }

    //Create methods to get all the fields from this class
    //          ?!?!?!?!?!?!?!?!??!?!?!?!
    public String getStudentFirstName() {
        return studentFirstName;
    }

    public boolean isIsLearning() {
        return isLearning;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public static String getTEACHER() {
        return TEACHER;
    }

}
