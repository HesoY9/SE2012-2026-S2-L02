package models;

public class Student {
    private String id;
    private String name;
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    } 
    /*
    returns the ID of the student
    @return ID of the student
    */
    String getId() {
        return id;
    }
    /*
    returns the name of the student
    @return name of the student
    */
    String getName() {
        return name;
    }
    /*
    returns a string representation of the student
    @return string representation of the student
    */
    String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }

}