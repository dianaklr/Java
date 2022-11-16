package Lesson2HW.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PC {
    private String manufacturer;
    private int year;
    private int price;

    public PC(String manufacturer, int year, int price) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.price = price;
    }


}
