//створити клас, який би описував подібні об'єкти

package Lesson2HW.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> address = new ArrayList <>();
        address.add("Kulas Light");
        address.add("Apt. 556");

        User user = new User("Shanna@melissa.tv", address, "1-770-736-8031 x56442", "anastasia.net");
        Customer customer = new Customer(1, "Leanne Graham","Bret", user);
        System.out.println(customer);

    }
}
