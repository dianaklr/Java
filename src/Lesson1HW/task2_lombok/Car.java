package Lesson1HW.task2_lombok;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Car {
    private int id;
    private String manufacturer;
    private String series;
    private int year;
    private double price;

}
