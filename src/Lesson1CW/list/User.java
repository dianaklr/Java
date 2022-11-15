package Lesson1CW.list;

import lombok.*;

import java.util.ArrayList;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private int id;
    private String name;
    private ArrayList <String> skills = new ArrayList<>();
}
