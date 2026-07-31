package models;

public class Course {
    private String ccode;
    private String title;

    public Course(String ccode, String title) {
        this.ccode = ccode;
        this.title = title;
    }
    /*
     * Returns the code of the course.
     * @return the code of the course
     */
    public String getCCode() {
        return ccode;
    }

    /*
     * Returns the title of the course.
     * @return the title of the course
     */
    public String getTitle() {
        return title;
    }
    /*
     * Returns a string representation of the course.
     * @return a string representation of the course
     */
    @Override
    public String toString() {
        return "Course Code: " + ccode + ", Title: " + title;
    }
}
