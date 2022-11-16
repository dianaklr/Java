package Lesson2HW.task2_2;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Workstation {
    private String voltage;
    private String videoCard;

    Laptop laptop = new Laptop();

    public Workstation(String voltage, String videoCard, Laptop laptop) {
        this.voltage = voltage;
        this.videoCard = videoCard;
        this.laptop = laptop;
    }
}
