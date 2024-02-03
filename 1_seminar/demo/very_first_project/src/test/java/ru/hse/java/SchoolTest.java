package ru_hse_java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;*/

/**
 * Test, which checks student group has all almamaters with graduation date
 * */
public class SchoolTest {

    @Test
    public void testNameIsValid() {
        String name = "И";
        Assertions.assertTrue(School.nameIsValid(name));
    }

    @Test
    public void testNameIsInvalid() {
        String name = "I";
        Assertions.assertFalse(School.nameIsValid(name));
    }

    @Test 
    public void testStudentNameIsValid() {
      String name = "Иван"; 
      Assertions.assertTrue(Student.nameIsValid(name));
    }

    @Test 
    public void testStudentNameIsValid() {
      String name = "Л1"; 
      Assertions.assertFalse(Student.nameIsValid(name));
    }

   @Test 
    public void testStudentMiddleNameIsValid() {
      String name = "Иванович"; 
      Assertions.assertTrue(Student.nameIsValid(name));
    }

    @Test 
    public void testStudentMiddleNameIsValid() {
      String name = "Llsc"; 
      Assertions.assertFalse(Student.nameIsValid(name));
    }

    @Test
    public void testStudentSecondNameIsValid() {
      String name = "Иванов"; 
      Assertions.assertTrue(Student.nameIsValid(name));
    }

    @Test
    public void testStudentSecondNameIsValid() {
      String name = "И ванов"; 
      Assertions.assertFalse(Student.nameIsValid(name));
    }

  @Test
  public void testStudentListCorrect() {
    Student student1 = new Student("Иван", "Иванов", "Иванович", new AlmaMater("HSE", ZonedDateTime.now()));
    Student student2 = new Student("Петров", "Петр", "Петрович", new AlmaMater("HSE", ZonedDateTime.now()));
    Student student3 = new Student("Васильев", "Василий", "Васильевич", new AlmaMater("HSE", ZonedDateTime.now()));
    List<Student> list = new ArrayList<>();
    list.add(student1);
    list.add(student2);
    list.add(student3);
    boolean check = true;
    for (Student student : list {
      if (student.getAlmaMater().getDateOfGraduation().isAfter(ZonedDateTime.now()))
        check = false;
      else if (student.getAlmaMater().getDateOfGraduation() == null)
        check = false;
      else if (student.getAlmaMater() == null)
        check = false;
    }
    Assertions.assertTrue(check);
  }
}
