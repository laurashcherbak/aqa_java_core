package aqa.core.lesson10.akylo.nsobol10;

public class Main {
        public static void main(String[] args) throws InvalidAgeException {
            Person Me = new Person();
            Me.setAge(22);
            try {
                Me.setAge(140);
            }
            catch (InvalidAgeException e) {
            }
        }
}
