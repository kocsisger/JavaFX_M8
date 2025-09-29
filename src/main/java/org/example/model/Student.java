package org.example.model;

import java.time.LocalDate;

public class Student {
    private String name;
    private int credits;
    private LocalDate dateOfBirth;

    public Student( String name, int credits, LocalDate dateOfBirth) {
        this.credits = credits;
        this.dateOfBirth = dateOfBirth;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "credits=" + credits +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
