package aqa.core.lesson5.akylo;

public class Human {

    private String name;
    private int age;
    private Role role;

    public Human(){
        //default constructor
    }
    public Human(String name, int age, Role role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
