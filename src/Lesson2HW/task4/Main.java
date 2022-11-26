package Lesson2HW.task4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> skillList = new ArrayList <>();
        skillList.add("java");
        skillList.add("js");
        skillList.add("python");

        ArrayList<String> car = new ArrayList<>();
        car.add("toyota");

        User user = new User(0, "vasya", "pupkin", Email.VALID, Age.ADULT, Gender.FEMALE, skillList, car );
    }
}
