package Lesson2HW.task2_2;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Laptop {
    private String model;
    private String characteristic;

    PC pc = new PC();

    public Laptop(String model, String characteristic, PC pc) {
        this.model = model;
        this.characteristic = characteristic;
        this.pc = pc;
    }
}
