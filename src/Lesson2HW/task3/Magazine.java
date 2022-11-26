package Lesson2HW.task3;

public class Magazine extends Book{
private String paints = "Brancher";

    public Magazine() {
    }

    public Magazine(String use, String type, String paints) {
        super(use, type);
        this.paints = paints;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Manufacturer's oil paints for sheet offset printing: " + paints);
    }
}
