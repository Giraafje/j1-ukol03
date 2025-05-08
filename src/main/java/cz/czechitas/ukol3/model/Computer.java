package cz.czechitas.ukol3.model;

public class Computer {
  private boolean isSwitchedOn;
  private Processor processor;
  private Memory memory;
  private Disc disc;

  public boolean isComputerSwitchedOn() {
    return isSwitchedOn;
  }

  public void switchOn() {
    if (isSwitchedOn) {
      System.err.println("Computer is already switched on");
    }
    else if (disc == null || processor == null || memory == null) {
      System.err.println("Computer does not contain all mandatory components");
    }
    else {
      this.isSwitchedOn = true;
      System.out.println("The computer switched on");
    }
  }

  public void switchOff() {
    if (!isSwitchedOn) {
      return;
    }
    this.isSwitchedOn = false;
    System.out.println("The computer switched off");
  }

  public Processor getProcessor() {
    return processor;
  }

  public void setProcessor(Processor processor) {
    if (processor == null) {
      System.err.println("Processor is missing");
      return;
    }
    this.processor = processor;
  }

  public Memory getMemory() {
    return memory;
  }

  public void setMemory(Memory memory) {
    if (memory == null) {
      System.err.println("Memory is missing");
      return;
    }
    this.memory = memory;
  }

  public Disc getDisc() {
    return disc;
  }

  public void setDisc(Disc disc) {
    if (disc == null) {
      System.err.println("Disc is missing");
      return;
    }
    this.disc = disc;
  }

  // Part 2
  public void createFileWithSize(long size) {
    long currentDiscCapacity = disc.getDiscCapacity();
    long currentUsedSpace = disc.getUsedSpace();
    long freeSpace = currentDiscCapacity - currentUsedSpace;
    if (!isSwitchedOn) {
      System.err.println("Computer is not switched on");
    }
    else if (size > freeSpace) {
      System.err.println("The size of the file is greater than the free space on the disk");
    }
    else {
      disc.setUsedSpace(currentUsedSpace + size);
    }
  }

  public void deleteFilesWithSize(long size) {
    long currentUsedSpace = disc.getUsedSpace();
    if (!isSwitchedOn) {
      System.err.println("Computer is not switched on");
    }
    else if (size > currentUsedSpace) {
      disc.setUsedSpace(0);
    }
    else {
      disc.setUsedSpace(currentUsedSpace - size);
    }
  }

  @Override
  public String toString() {
    return "Computer is switched on: " + isSwitchedOn;
  }
}
