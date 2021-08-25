package aqa.core.lesson6;

public class Homework6 {
    public static class Dinosaur {
        public static void main(String[] arg) {
        }

        String name;
        private String species;
        public String getSpecies;

        {


        }

        private String color;
        public String getColor;

        {


        }


        Dinosaur() {
            name = "Din1";
            species = "small";
            color = "green";
            Dinosaur dinosaur = new Dinosaur();
            name = "Din2";
            species = "middle";
            color = "brown";
            Dinosaur dinosaur1 = new Dinosaur();

            System.out.println(dinosaur.getSpecies());
            System.out.println(dinosaur1.getColor());


        }

        public String getSpecies() {
            return species;
        }

        public String getColor() {
            return color;

            //toString() method

        }
        @Override
        public String toString() {
            return "This is Dinosaur";

        }
        public class main {
            
        }
            //equals() method

        private long id;
        public Dinosaur(long id) {
            this.id = id;

        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass());


            Dinosaur dinosaur = (Dinosaur) o;
            if (id != dinosaur.id) return false;
            return true;

            //hashCode() method
        }
        private long a;
        private int height;
        public Dinosaur (long a, int height) {
            this.a = a;
            this.height = height;

        }
        @Override
        public int hashCode() {
            int result = (int) (a ^ (a >>> 8));
            result = 11 * result + height;
            return result;

        }

        public Dinosaur getNewDinosaur() {
            return new Dinosaur();

        }
        class GreyDinosaur extends Dinosaur {
        @Override
        public GreyDinosaur getNewDinosaur(){
            return new GreyDinosaur();
        }

        }
        public class MiniDinosaur extends Dinosaur {
            public MiniDinosaur (int speed) {super(speed);
            }
            public int getKind() { return 5; }
        }



    }
}









