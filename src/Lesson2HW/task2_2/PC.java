package Lesson2HW.task2_2;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PC {
    private int id;
    private int price;

    public PC(int id, int price) {
        this.id = id;
        this.price = price;
    }
}
