package aqa.core.lesson6.kfedechko;

import java.util.Objects;

public class Flower {

    private String name;
    private String color;
    private Integer ageDays = 0;

    Flower() {
    }

    public Flower(String name, String color, Integer ageDays) {
        this.name = name;
        this.color = color;
        this.ageDays = ageDays;
    }

    public void waterFlower () {
        this.ageDays++;
    }

    public boolean isBlooming () {
        return ageDays > 10 && ageDays < 20;
    }

    String getColor() {
        return color;
    }

    Integer getAgeDays() {
        return ageDays;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", ageDays=" + ageDays +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Objects.equals(name, flower.name) &&
                Objects.equals(color, flower.color) &&
                Objects.equals(ageDays, flower.ageDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, ageDays);
    }
}
