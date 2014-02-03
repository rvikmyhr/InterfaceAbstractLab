/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Ron
 */
public class Startup {

    public static void main(String[] args) {
        Course course1 = new AdvancedJavaCourse("AJC1", "000");
        IntroJavaCourse course2 = new IntroJavaCourse("IJC1", "001");
        Course course3 = new IntroToProgrammingCourse("IPC1", "002");
        course1.setCredits(4);
        course2.setCredits(3);
        course2.setPrerequisites("A class");
        System.out.println(course1.getCourseName() + " " + course1.getCourseNumber());
        System.out.println(course2.getCourseName() + " " + course2.getPrerequisites());
        System.out.println(course3.getCourseName() + " " + course3.getCredits());
//You can use the LSP when you only need methods and properties from the superclass.
//If you need to use a method in the subclass, it doesn't appear to let you use it.
//Interfaces ensure you include certain methods into classes.
    }
}
