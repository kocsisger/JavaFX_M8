package org.example.model;

import java.time.LocalDate;

public class Model {
    private Student student;

    public Model() {
        student = new Student("Robert Smith",
                40,
                LocalDate.of(2000, 01, 01));
    }

    public Student getStudent() {
        return student;
    }
}
