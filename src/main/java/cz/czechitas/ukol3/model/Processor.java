package cz.czechitas.ukol3.model;

public class Processor {
  public String manufacturer;
  public long speed;

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public long getSpeed() {
    return speed;
  }

  public void setSpeed(long speed) {
    this.speed = speed;
  }

  @Override
  public String toString() {
    return "Processor is manufactured by " + manufacturer + " and its speed is " + speed;
  }
}
