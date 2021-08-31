package aqa.core.lesson10.Nazarvdocyh_10.ExceptionDemo;

public class Person {



        private String Name;
        private String LastName;
        private int Age;



        public Person(String Name, String LastName, int Age) {
            this.Name = Name;
            this.LastName = LastName;
            this.Age = Age;
        }

        public String getName() {
            return Name;
        }

        public void setFirstName(String Name) {
            this.Name = Name;
        }

        public String getLastName() {
            return LastName;
        }

        public void setLastName(String LastName) {
            this.LastName = LastName;
        }

        public int getAge() {
            return Age;
        }


        public void setAge(int Age) throws InvalidAgeException {
            if (Age > 120 || Age < 0) throw new InvalidAgeException();
            this.Age = Age;
        }

    }
