package org.example.prototype;

import java.util.Objects;

public abstract class JangoFett {
  private int chromosomes;

  public abstract JangoFett clone();

  public JangoFett() {
  }

  public JangoFett(JangoFett jangoFett) {
    if (jangoFett != null) {
      this.chromosomes = jangoFett.chromosomes;
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
    JangoFett jangoFett = (JangoFett) o;
    return chromosomes == jangoFett.chromosomes;
  }

  @Override
  public int hashCode() {
    return Objects.hash(chromosomes);
  }

  public int getChromosomes() {
    return chromosomes;
  }

  public void setChromosomes(int chromosomes) {
    this.chromosomes = chromosomes;
  }


}
