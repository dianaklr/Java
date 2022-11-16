//
//Створити та описати наступну їєрархію
//        PC-Laptop-Ultrabook
//        PC-Laptop- Workstation
//        Загальна кількість вкористаних класів - 4!

package Lesson2HW.task2;

public class Main {
    public static void main(String[] args) {

        PC pc1 = new PC("Apple", 2019, 950);
        Laptop laptop1 = new Laptop("123x", true, pc1);

        Ultrabook ultrabook = new Ultrabook("anna", 2345, laptop1);
        System.out.println(ultrabook);
    }
}
