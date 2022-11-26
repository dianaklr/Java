package Lesson2HW.task4;


import lombok.Getter;
import lombok.Setter;

public enum Email {
    INVALID(false, ""), VALID(true, "");

    @Getter
    @Setter
    private boolean atSign;
    private String email;


    Email(boolean b) {
    }

    Email(boolean atSign, String email) {
        this.email = email;

        if(email.length()<10){
            this.atSign = false;
        }else{
            this.atSign = true;
        }

    }

}

