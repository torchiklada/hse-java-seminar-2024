package ru.hse.java;

import java.time.ZonedDateTime;
import java.util.regex.Pattern;

public class Student {
  private String name;
  private String secondName;
  private String middleName;
  private AlmaMater almaMater;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getSecondName() {
    return secondName;
  }
  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  private static final Pattern NAME_MASK = Pattern.compile("[А-Яа-я]+");
  
  static boolean nameIsValid(String name) {
      return NAME_MASK.matcher(name).matches();
  }

  public Student(String name, String secondName, String middleName, AlmaMater almaMater) {
    if (!nameIsValid(name) || !nameIsValid(secondName) || !nameIsValid(middleName) || name == null || secondName == null || middleName == null) {
      throw new IllegalArgumentException();
    }
    if (almaMater == null || !nameIsValid(almaMater.getName())){
      throw new IllegalArgumentException();
    }
    this.name = name;
    this.secondName = secondName;
    this.middleName = middleName;
    this.almaMater = almaMater;
  }

}
