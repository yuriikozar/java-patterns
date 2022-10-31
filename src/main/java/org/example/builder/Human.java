package org.example.builder;

import java.util.StringJoiner;

public class Human {
  private String firstName;
  private String lastName;
  private int age;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  private Human(HumanBuilder builder) {
    this.age = builder.age;
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Human.class.getSimpleName() + "[", "]")
        .add("firstName='" + firstName + "'")
        .add("lastName='" + lastName + "'")
        .add("age=" + age)
        .toString();
  }

  public static class HumanBuilder {
    private String firstName;
    private String lastName;
    private int age;


    public HumanBuilder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public HumanBuilder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public HumanBuilder age(int age) {
      this.age = age;
      return this;
    }

    public Human build() {
      return new Human(this);
    }
  }
}
