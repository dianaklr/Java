package Lesson1HW.task2_lombok;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(0, "BMW", "X5", 2016, 35500);
        System.out.println(car1);

        Car car2 = new Car(1, "Porsche", "Cayene S", 2014, 42300);
        System.out.println(car2);
    }
}
