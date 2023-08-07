package org.example.prototype;

import java.util.Objects;

public class BobaFett extends JangoFett {
  private String name;
  private String individualNumber;

  public BobaFett() {
  }

  public BobaFett(BobaFett bobaFett) {
    super(bobaFett);
    if (bobaFett != null) {
      this.name = bobaFett.name;
      this.individualNumber = bobaFett.individualNumber;
    }
  }

  @Override
  public JangoFett clone() {
    return new BobaFett(this);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    BobaFett bobaFett = (BobaFett) o;
    return Objects.equals(name, bobaFett.name) && Objects.equals(individualNumber,
        bobaFett.individualNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), name, individualNumber);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getIndividualNumber() {
    return individualNumber;
  }

  public void setIndividualNumber(String individualNumber) {
    this.individualNumber = individualNumber;
  }
}
