//створити клас, який би описував подібні об'єкти

package Lesson2HW.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> address = new ArrayList <>();
        address.add("Kulas Light");
        address.add("Apt. 556");

        ArrayList<String> addressUser2 = new ArrayList <>();
        address.add("Victor Plains");
        address.add("Apt. 556");

        User user1 = new User(1, "Leanne Graham","Bret", "Sincere@april.biz", address, "1-770-736-8031 x56442", "hildegard.org");
        System.out.println(user1);

        User user2 = new User(2, "Ervin Howell","Antonette", "Shanna@melissa.tv", address, "1-770-736-8031 x56442", "anastasia.net");
        System.out.println(user2);
    }
}
