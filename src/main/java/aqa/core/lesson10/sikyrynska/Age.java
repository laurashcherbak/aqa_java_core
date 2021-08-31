package aqa.core.lesson10.sikyrynska;

public class Age {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        try{
            System.out.println("Enter the age of employee, please: ");
            employee1.setAge(0);
        }catch(InvalidAgeException Exception){
            System.out.println("Invalid age value, please enter age value again: ");
        }

    }

}
