package Lesson1CW.chain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class User {
    private int id;
    private String nane;
    private boolean status;

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public User setNane(String nane) {
        this.nane = nane;
        return this;
    }

    public User setStatus(boolean status) {
        this.status = status;
        return this;
    }
}
