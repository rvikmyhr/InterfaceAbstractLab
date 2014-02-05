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
public abstract class Course {

    private String courseName;
    private String courseNumber;
    private double credits;

    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    public abstract void setCourseNumber(String courseNumber);

    public abstract void setCourseName(String courseName);

    public abstract void setCredits(double credits);

    public final String getCourseName() {
        return courseName;
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final double getCredits() {
        return credits;
    }
}
