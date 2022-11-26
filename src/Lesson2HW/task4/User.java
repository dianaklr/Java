package Lesson2HW.task4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String surname;
    private Email email;
    private Age age;
    private Gender gender;
    private ArrayList <String> skills = new ArrayList<>();
    private ArrayList <String> car = new ArrayList<>();
}
