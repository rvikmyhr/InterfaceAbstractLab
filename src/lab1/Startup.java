/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author Ron
 */
public class Startup {
    
        public static void main(String[] args) {
            
            AdvancedJavaCourse course1 = new AdvancedJavaCourse("AJC","000");
            IntroJavaCourse course2 = new IntroJavaCourse("IJC","001");
            Course course3 = new IntroToProgrammingCourse("IPC","002");
            
            course1.setPrerequisites("Class1");
            course2.setPrerequisites("Class2");
            course3.setCredits(3);
            
            System.out.println(course1.getCourseName() + " " + course1.getCourseNumber() + " " +
                    course1.getPrerequisites());
            System.out.println(course2.getCourseName() + " " + course2.getCourseNumber() + " " +
                    course2.getPrerequisites());
            System.out.println(course3.getCapitalizedCourseName() + " " + course3.getCredits());
            
            
            //Liskov substitution principle is useful to ensure that behavior
            // does not change
        }
}
