package com.epam.mjc;


import com.epam.mjc.exceptions.StudentNotFoundException;

public class StudentManager {

    private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public Student find(long studentID) throws StudentNotFoundException {
        if (Student.getValueOf(studentID) == null) {
            throw new StudentNotFoundException(String.format("Could not find student with ID %d", studentID));
        }
        return Student.getValueOf(studentID);
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        for (long id : IDs) {
            Student student = manager.find(id);
            System.out.println("Student name " + student.getName());
        }
    }
}