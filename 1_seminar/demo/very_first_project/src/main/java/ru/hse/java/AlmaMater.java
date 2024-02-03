package ru.hse.java;

import java.time.ZonedDateTime;

public class AlmaMater {
  private String name;
  private ZonedDateTime dateOfGraduation;

  public String getName() {
    return name;
  } 

  public void setName(String name) {
    this.name = name;
  }

  public ZonedDateTime getDateOfGraduation() {
    return dateOfGraduation;
  }

  static boolean dayIsValid(int day) {
    return day >= 1 && day <= 31;
  }

  static boolean monthIsValid(int month) {
    return month >= 1 && month <= 12;
  }

  static boolean yearIsValid(int year) {
    return year >= 1900 && year <= 2100;
  }

  public void setDateOfGraduation(int day, int month, int year) {
    if (!dayIsValid(day) || !monthIsValid(month) || !yearIsValid(year)) {
      throw new IllegalArgumentException();
    }
    this.dateOfGraduation = ZonedDateTime.of(year, month, day, 0, 0, 0, 0, ZonedDateTime.now().getZone());
  }

}
