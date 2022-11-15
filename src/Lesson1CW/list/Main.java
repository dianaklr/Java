package Lesson1CW.list;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList <String> list = new ArrayList<String>();
//        list.add("hello");
//        list.add("hello!!");
//        System.out.println(list);
    ArrayList <String> skillList = new ArrayList <>();
    skillList.add("java");
    skillList.add("js");
    skillList.add("python");
    User user = new User(1, "dianka", skillList);
        System.out.println(user);

      user.getSkills().add("html");
        System.out.println(user);
    }
}
