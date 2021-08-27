package aqa.core.lesson6.RomanovYevgen;

import java.util.Objects;

public abstract class Owl{
        public int id;
        public float wingspan;
        public boolean isPredator;
        public Objects Owl;



        public Owl(float weight, boolean isPredator) {
            this.id = HomeWork6.num;
            HomeWork6.num++;
            this.wingspan = wingspan;
            this.isPredator = isPredator;
        }

    public Owl() {

    }

    public int getId() {
            return id;
        }

        public float getWeight() {
            return wingspan;
        }

        public void setWeight(float weight) {
            this.wingspan = weight;
        }

        public boolean isPredator() {
            return isPredator;
        }

        public void setPredator(boolean predator) {
            isPredator = predator;
        }

        public void fishGrow () {
            this.wingspan +=1;
        }

        public void fishSays () {
            System.out.println("Byl Byl " + getId());
        }

        @Override
        public String toString() {
            return "Fish{" +
                    "id=" + id +
                    ", weight=" + wingspan +
                    ", isPredator=" + isPredator +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Owl)) return false;
            Owl Owl = (Owl) o;
            return getId() == Owl.getId() && Float.compare(Owl.getWeight(), getWeight()) == 0 && isPredator() == Owl.isPredator();
        }

        @Override
        public int hashCode() {
            return Objects.hash(getId(), getWeight(), isPredator());
        }

    public abstract void owlSingin();
}

