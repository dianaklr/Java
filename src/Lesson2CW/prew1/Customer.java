package Lesson2CW.prew1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private String login;
    private String password;

    private Passpost passpost;

    public Customer(String login, String passpost) {
        this.login = login;
//        this.passpost = passpost;
    }
}
