package Lesson2HW.task4;

import lombok.Getter;
import lombok.Setter;

public enum Gender {
    MALE(true), FEMALE(false);

    @Getter
    @Setter

    private boolean gender;

    Gender() {
    }

    Gender(boolean gender) {
        this.gender = gender;
    }
}
