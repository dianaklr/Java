package Lesson2HW.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
//@AllArgsConstructor
public class User {

    private String email;
    private ArrayList<String> address = new ArrayList<>();
    private String phone;
    private String website;

    public User(String email, ArrayList<String> address, String phone, String website) {
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.website = website;
    }
}
