package aqa.core.lesson11.mykhailo_osadtsiv.company;

import javax.management.InvalidAttributeValueException;

public class ToLowSalary extends InvalidAttributeValueException {
    private final String errorMessage = "The salary must be > 380";

    public ToLowSalary(Employee e) {
        toLowSalaryPrint();
        e.setSallarry();
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void toLowSalaryPrint() {
        System.out.println(getErrorMessage());
    }
}
