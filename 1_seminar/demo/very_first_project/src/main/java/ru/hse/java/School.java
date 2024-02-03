package ru_hse_java;

import java.util.List;
import java.util.Objects;

public class School {
    // fie
    private String name;
    private List<Student> students;

    public School(String name) {
        this(name, List.of());
    }

    public School(String name, List<Student> students) {
        Objects.requireNonNull(name);
        Objects.requireNonNull(students);
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;

        return Objects.equals(name, school.name) &&
                Objects.equals(students, school.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
