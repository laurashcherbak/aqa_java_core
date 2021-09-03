package aqa.core.lesson11.RomanovYevgen;

import javax.management.InvalidAttributeValueException;

public class ToLowSallarry extends InvalidAttributeValueException {

    public ToLowSallarry(Employee e) {
        ToLowSallarry toLowSallarry = new ToLowSallarry();
        e.setSallarry();
    }
    public ToLowSallarry() {
        this.toLowSalaryPrint();
    }

    public String getErrorMessage() {
        String errorMessage = "The sallarry must be > 450";
        return errorMessage;
    }

    public void toLowSalaryPrint() {
        System.out.println(getErrorMessage());
    }
}
