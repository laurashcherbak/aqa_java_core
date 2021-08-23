package aqa.core.lesson5.yuliiaavrakhova;

import java.util.List;

public class Car {

    private String model;
    public String color;
    private int amountOfPas;
    private int gas;
    private List<Human> passtngers;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.equals("focus")) {
            this.model = model;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAmountOfPas() {
        return amountOfPas;
    }

    public void setAmountOfPas(int amountOfPas) {
        this.amountOfPas = amountOfPas;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public List<Human> getPasstngers() {
        return passtngers;
    }

    public void setPasstngers(List<Human> passtngers) {
        this.passtngers = passtngers;
    }
}
