package Lesson2CW.prew1;

public class Main {
    public static void main(String[] args) {
        Passpost passpost = new Passpost("ABC", "123");
        Customer customer =  new Customer("qwe", "123", passpost);
        User user = new User(1, "anna", passpost);
        User user2 = new User(2, "vika", "ABC", "123Ac");
    }
}
