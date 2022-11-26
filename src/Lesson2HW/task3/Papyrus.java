package Lesson2HW.task3;

public class Papyrus {
    private String use = "transmission of information";

    public Papyrus() {
    }

    public Papyrus(String use) {
        this.use = use;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    @Override
    public String toString() {
        return "Papyrus{" +
                "use='" + use + '\'' +
                '}';
    }


    public void info(){
        System.out.println("Using: " +use);
    }
}
