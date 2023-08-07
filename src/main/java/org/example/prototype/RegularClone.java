package org.example.prototype;

import java.util.Objects;

public class RegularClone extends JangoFett {
  private String individualNumber;

  @Override
  public JangoFett clone() {
    return new RegularClone(this);
  }

  public RegularClone() {
  }

  public RegularClone(RegularClone regularClone) {
    super(regularClone);
    if (regularClone != null) {
      this.individualNumber = regularClone.individualNumber;
    }
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
    RegularClone that = (RegularClone) o;
    return individualNumber == that.individualNumber;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), individualNumber);
  }

  public String getIndividualNumber() {
    return individualNumber;
  }

  public void setIndividualNumber(String individualNumber) {
    this.individualNumber = individualNumber;
  }
}
