package cz.czechitas.ukol3.model;

public class Disc {
  private long discCapacity;
  private long usedSpace;

  public long getDiscCapacity() {
    return discCapacity;
  }

  public void setDiscCapacity(long capacity) {
    this.discCapacity = capacity;
  }

  public long getUsedSpace() {
    return usedSpace;
  }

  public void setUsedSpace(long usedSpace) {
    this.usedSpace = usedSpace;
  }

  @Override
  public String toString() {
    return "Disc capacity is " + discCapacity + " and used space is " + usedSpace;
  }
}
