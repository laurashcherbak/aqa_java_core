package main.java.aqa.core.lesson6.vriaboshapka;

import java.util.Objects;

public class Child {
    String name;
    String sex;
    int age;

    public Child(){
        this.name="Bob";
        this.sex="boy";
        this.age=11;
    }
    public Child(String name, String sex, int age){
        this.name=name;
        this.sex=sex;
        this.age=age;
    }
    public void saySomething(){
        System.out.println("Hello! my name: "+name);
    }
    @Override
    public String toString(){
        return "name: "+this.name+"\nsex: "+this.sex+"\nage: "+this.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.toString());
    }

    @Override
    public boolean equals(Object other){
        if (this == other) return true;
        if (other== null || getClass() !=other.getClass())
            return false;
        Child child = (Child) other;
        return Objects.equals(this.name, child.name) && Objects.equals(this.sex, child.sex) && this.age== child.age;
    }


}
