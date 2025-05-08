package cz.czechitas.ukol3.model;

public class Memory {
  private long memoryCapacity;

  public long getMemoryCapacity() {
    return memoryCapacity;
  }

  public void setMemoryCapacity(long capacity) {
    this.memoryCapacity = capacity;
  }

  @Override
  public String toString() {
    return "Memory capacity is " + memoryCapacity;
  }
}
