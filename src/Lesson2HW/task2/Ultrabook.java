package Lesson2HW.task2;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ultrabook {
    private String owner;
    private int phone;

    private Laptop laptop;

    public Ultrabook(String owner, int phone, PC pc){
        this.owner = owner;
        this.phone = phone;
        this.laptop = new Laptop(laptop.getSerialNumber(), getLaptop().isGuarantee());
    }


    public Ultrabook(String owner, int phone, Laptop laptop) {
        this.owner = owner;
        this.phone = phone;
        this.laptop = laptop;

    }
}
