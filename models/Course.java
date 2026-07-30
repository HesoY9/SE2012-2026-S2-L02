package models;

public class Course {
    private String ccode;
    private String title;
    public Course(String ccode, String title) {
        this.ccode = ccode;
        this.title = title;
    }
    /*
    returns the course code 
    @return course code
    */
    String getCCode() {
        return ccode;
    }
    /*
    returns the course title
    @return course title
    */
    String getTitle() {
        return title;
    }
    /*
    returns a string representation of the course
    @return string representation of the course
    */
    String toString() {
        return "Course Code: " + ccode + ", Title: " + title;
    }
}
