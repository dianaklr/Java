package prew1.prew4;


public class Main  {
    public static void main(String[] args) {
        User user2 = new User(1, "anna", true, 50.2);
        System.out.println(user2);

        user2.setName("arai");
        System.out.println(user2.getName() );

    }
}
