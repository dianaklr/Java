package Lesson2HW.task4;

import lombok.Getter;
import lombok.Setter;

public enum Age {
    TEENAGER("t"), ADULT("a"), ELDERLY("e");

    @Getter
    @Setter
    private String age;
    private int inputAge;

    Age() {
    }

    Age(String age) {
//        this.age = age;
        if (inputAge>10&& inputAge<19){
            this.age = "t";
        }  else if (inputAge>=20&& inputAge<60){
            this.age = "a";
        }  else if (inputAge>=60){
            this.age = "e";
        }
    }


}
