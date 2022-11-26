package Lesson2HW.task3_2;

public class Comics extends Book{
    String company = "Marvel";

    public Comics() {
    }

    public Comics(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void info() {
        super.info();
        System.out.println("company: " + company);
    }
}
