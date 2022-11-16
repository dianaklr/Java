package Lesson2CW.prew1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//@AllArgsConstructor
public class User {
    private int id;
    private String name;

    private Passpost passpost;


    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public User(int id, String name, String series, String number) {
        this.id = id;
        this.name = name;
        this.passpost = new Passpost(series, number);
    }

    public User(int id, String name, Passpost passpost) {
        this.id = id;
        this.name = name;
        this.passpost = passpost;
    }
}
