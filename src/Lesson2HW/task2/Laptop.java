package Lesson2HW.task2;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Laptop {
    private String serialNumber;
    private boolean guarantee;
    private PC pc;

    public Laptop(String serialNumber, boolean guarantee){
        this.serialNumber = serialNumber;
        this.guarantee = guarantee;
    }

    public Laptop(String serialNumber, boolean guarantee, PC pc) {
        this.serialNumber = serialNumber;
        this.guarantee = guarantee;
        this.pc = pc;
    }
}
