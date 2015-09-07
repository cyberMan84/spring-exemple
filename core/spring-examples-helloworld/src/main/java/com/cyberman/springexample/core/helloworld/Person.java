package com.cyberman.springexample.core.helloworld;

/**
 * Created by cybermen on 27/08/15.
 */
public class Person {

  private String firstName;

  private String lastName;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    final Person person = (Person) o;

    if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) {
      return false;
    }
    if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int result = firstName != null ? firstName.hashCode() : 0;
    result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    final StringBuilder result = new StringBuilder();
    result.append("My firstName is : ");
    result.append(null == firstName ? "Empty" : firstName);
    result.append("\nMy lastName is : ");
    result.append(null == lastName ? "Empty" : lastName);
    return result.toString();
  }
}
