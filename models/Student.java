package models;

/**
 * Represents a student in the system.
 */
public class Student {
     
    private String id;
    private String name;
    private Course[] courses;
    private int courseCount = 0;

    /*
     * Constructs a new Student with the specified ID and name.
     * @param id the ID of the student
     * @param name the name of the student
     */
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new Course[10];
    }

    /*
     * Returns the ID of the student.
     * @return the ID of the student
     */
    public String getId() {
        return id;
    }

    /*
     * Returns the name of the student.
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /*
     * Enrolls the student in the specified course.
     * @param course the course to enroll in
     */
    public void enroll(Course course) {
        if (course == null) {
            return;
        }
        if (courseCount < courses.length) {
            courses[courseCount++] = course;
        } else {
            System.out.println("Cannot enroll in more than 10 courses.");
        }
    }

    /*
     * Returns the array of courses the student is enrolled in.
     * @return the array of courses
     */
    public Course[] getCourses() {
        return courses;
    }

    /*
     * Returns the number of courses the student is enrolled in.
     * @return the number of courses
     */
    public int getCourseCount() {
        return courseCount;
    }

    /*
     * Returns a string representation of the student.
     * @return a string representation of the student
     */
    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }
}