package aqa.core.lesson11.RomanovYevgen;

import javax.management.InvalidAttributeValueException;

public class ToLowSallarry extends InvalidAttributeValueException {
    private final String errorMessage = "The sallarry must be > 450";

    public ToLowSallarry(Employee e) {
        new ToLowSallarry();
        e.setSallarry();
    }
     public ToLowSallarry() {
        this.toLowSalaryPrint();
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void toLowSalaryPrint() {
        System.out.println(getErrorMessage());
    }
}
