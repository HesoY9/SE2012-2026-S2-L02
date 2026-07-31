package services;

import models.Course;
import models.Student;
/**
 * Manages student enrollment in courses.
 */
public class enrollmentManager {
    /*
     * Enrolls a student in a course.
     * @param student the student to enroll
     * @param course the course to enroll in
     */
    public void enroll(Student student, Course course) {
        if (student == null || course == null) {
            return;
        }
        student.enroll(course);
    }
}
