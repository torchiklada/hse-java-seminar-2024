package ru.hse.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

}
