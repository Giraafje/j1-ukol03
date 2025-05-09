package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Computer;
import cz.czechitas.ukol3.model.Disc;
import cz.czechitas.ukol3.model.Memory;
import cz.czechitas.ukol3.model.Processor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        System.out.println("Program spuštěn.");

        Computer lenkaHPComputer = new Computer();
        System.out.println(lenkaHPComputer.isComputerSwitchedOn()); //false

        lenkaHPComputer.switchOn(); //Computer does not contain all mandatory components

        Processor lenkaHPProcessor = new Processor();
        lenkaHPProcessor.setSpeed(2_800_000_000L);
        lenkaHPProcessor.setManufacturer("HP");

        Memory lenkaHPMemory = new Memory();
        lenkaHPMemory.setMemoryCapacity(16_000_000_000L);

        Disc lenkaHPDisc = new Disc();
        lenkaHPDisc.setDiscCapacity(754_682_356_850L);

        lenkaHPComputer.setProcessor(lenkaHPProcessor);
        lenkaHPComputer.setMemory(lenkaHPMemory);
        lenkaHPComputer.setDisc(lenkaHPDisc);

        lenkaHPComputer.switchOn();
        System.out.println(lenkaHPComputer); //Computer is switched on: true
        lenkaHPComputer.switchOn(); //Computer is already switched on
        lenkaHPComputer.switchOff();
        System.out.println(lenkaHPComputer); //Computer is switched on: false
        lenkaHPComputer.switchOff(); //nothing happens

        // Part 2
        lenkaHPComputer.createFileWithSize(11_000L); //Computer is not switched on
        lenkaHPComputer.switchOn();
        lenkaHPComputer.createFileWithSize(11_000L);
        lenkaHPComputer.createFileWithSize(754_682_356_000L); //The size of the file is greater than the free space on the disk
        lenkaHPComputer.createFileWithSize(110_000L);
        System.out.println(lenkaHPDisc); //Disc capacity is 754682356850 and used space is 121000
        lenkaHPComputer.switchOff();

        lenkaHPComputer.deleteFilesWithSize(11_000L); //Computer is not switched on
        lenkaHPComputer.switchOn();
        lenkaHPComputer.deleteFilesWithSize(11_000L);
        System.out.println(lenkaHPDisc);
        lenkaHPComputer.deleteFilesWithSize(10_000L);
        System.out.println(lenkaHPDisc);
        lenkaHPComputer.deleteFilesWithSize(120_000L);
        System.out.println(lenkaHPDisc); //Disc capacity is 754682356850 and used space is 0
        lenkaHPComputer.switchOff();
    }

}
