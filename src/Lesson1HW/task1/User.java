package Lesson1HW.task1;

public class User {

    int id;
    String name;
    String surname;
    int age;
    String country;

    public User(){}

    public User(int id, String name, String surname, int age, String country) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.country = country;
    }
    public String toString(){
       return this.id + ") name: "+ this.name + " surname: "+ this.surname + " age: "+ this.age + " | country: "+ this.country;

    }
}
