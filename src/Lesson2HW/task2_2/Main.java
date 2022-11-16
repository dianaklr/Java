package Lesson2HW.task2_2;

public class Main {
    public static void main(String[] args) {
        PC pc = new PC(123, 4500);
        Laptop laptop = new Laptop("AX-230K", "ARTLINE Overlord RTX", pc);

        Workstation workstation = new Workstation(" ±12 ", "GeForce RTX 3090 24GB", laptop);

        System.out.println(workstation);
    }
}
