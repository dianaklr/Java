package Lesson2HW.task3;

public class Book extends Papyrus{
 private String type = "paper";

    public Book() {
    }

    public Book(String use, String type) {
        super(use);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void info() {
        super.info();
        System.out.println("type of material: " + type);
    }
}
