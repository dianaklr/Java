package prew1.prew6_arr;

public class Main {
    public static void main(String[] args) {
        String [] arr = {"one", "two", "thee"};
        System.out.println(arr.length);

        System.out.println("----1---");

        for (int a =0; a < arr.length; a++){
            String string = arr[a];
            System.out.println(string);
        }

        System.out.println("---2----");

        for (String string:arr) {
            System.out.println(string);
        }

        System.out.println("----3---");

        int i = 0;
        while (i < arr.length){
            System.out.println(arr[i]);
            i++;

        }
    }
}
