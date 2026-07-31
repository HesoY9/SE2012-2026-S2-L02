package mainapp;

import java.util.Scanner;
import models.Course;
import models.Student;
import services.enrollmentManager;

/**
 * Main class for the student enrollment application.
 */
public class Main {
    
    private static int studentCount = 0;
    private static Student[] students = new Student[100];
    private static enrollmentManager enroller = new enrollmentManager();

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean exit = false;
        /*
         * Main loop to display menu and handle user input.
         */
        while (!exit) {
            System.out.println("1. Enroll a student in a course");
            System.out.println("2. List all students");
            System.out.println("3. Search for a student by ID");
            System.out.println("4. Sort students by name");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scn.nextInt();
            scn.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    String id = scn.nextLine();
                    System.out.print("Enter student name: ");
                    String name = scn.nextLine();
                    System.out.print("Enter number of courses to enroll: ");
                    int courseCount = scn.nextInt();
                    scn.nextLine();

                    Student student = new Student(id, name);
                    for (int i = 0; i < courseCount; i++) {
                        System.out.println("Course " + (i + 1) + ":");
                        System.out.print("Enter course code: ");
                        String ccode = scn.nextLine();
                        System.out.print("Enter course title: ");
                        String title = scn.nextLine();
                        Course course = new Course(ccode, title);
                        enroller.enroll(student, course);
                    }

                    if (studentCount < students.length) {
                        students[studentCount++] = student;
                    } else {
                        System.out.println("Cannot add more students; capacity full.");
                    }
                    break;
                case 2:
                    System.out.println("Listing all students:");
                    for (int i = 0; i < studentCount; i++) {
                        System.out.println(students[i].toString());
                    }
                    break;
                case 3:
                    System.out.print("Enter student ID to search: ");
                    String searchId = scn.nextLine();
                    searchStudentById(searchId);
                    break;
                case 4:
                    sortStudentsByName(students, studentCount);
                    System.out.println("Students sorted by name.");
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scn.close();
    }
    
    /*
     * Searches for a student by ID and displays their information.
     * @param id the ID of the student to search for
     */
    private static void searchStudentById(String id) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId().equals(id)) {
                System.out.println(students[i].toString());
                System.out.println("Enrolled Courses:");
                Course[] courses = students[i].getCourses();
                for (Course course : courses) {
                    if (course != null) {
                        System.out.println(course.toString());
                    }
                }
                return;
            }
        }
        System.out.println("Student not found.");
    }

    /*
     * Sorts the list of students by their names in ascending order.
     * @param list the array of students to sort
     * @param count the number of students in the array
     */
    private static void sortStudentsByName(Student[] list, int count) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (list[j].getName().compareTo(list[j + 1].getName()) > 0) {
                    Student temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}
