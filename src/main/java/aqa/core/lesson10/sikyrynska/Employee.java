package aqa.core.lesson10.sikyrynska;

public class Employee {
    public String name;
    public String surname;
    public int age;

    public Employee(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public Employee(){
    }

    public String getName() { return name;
    }

    public void setName(String name) { this.name = name;
    }

    public String getSurname() { return surname;
    }

    public void setSurname(String surname) { this.surname = surname;
    }

    public int getAge() { return age;
    }

    public void setAge(int age){ this.age = age;
        if (this.age < 0 ) {
            throw new InvalidAgeException();
        } else if(this.age > 100){
            throw new InvalidAgeException(); }
    }
}
