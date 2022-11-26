package Lesson2HW.task1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private int id;
    private String name;
    private String username;

    private User user;

    public Customer(int id, String name, String username, User user) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.user = user;
    }
}
