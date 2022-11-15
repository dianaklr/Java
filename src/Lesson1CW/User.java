package Lesson1CW;


public class User{
    int id;
    String name;
    boolean status;
    String[] skills;

    public User(){}

    public User(int id, String name, boolean status, String[] skills) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.skills = skills;
    }

//    public void setId(int id){
//        this.id = id;
//    }
//
//    public int getId(){
//    return this.id;
//    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }
}



