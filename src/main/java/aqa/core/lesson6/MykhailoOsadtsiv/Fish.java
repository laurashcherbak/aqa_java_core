package aqa.core.lesson6.MykhailoOsadtsiv;

public class Fish {
    // public int id;
    public float weight;
    public boolean isPredator;

    public Fish() {
        //      this.id = HomeWork6.index;
        //      HomeWork6.index++;
    }

    public Fish(float weight, boolean isPredator) {
        //   this.id = HomeWork6.index;
        //   HomeWork6.index++;
        this.weight = weight;
        this.isPredator = isPredator;
    }

    //  public int getId() {
    //      return id;
    //  }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public void fishGrow() {
        this.weight += 1;
    }

    public void fishSays() {
        System.out.println("Byl Byl ");
    }

    @Override
    public String toString() {
        return "Fish{" +
                //   "id=" + id +
                "weight=" + weight +
                ", isPredator=" + isPredator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fish)) return false;
        Fish fish = (Fish) o;
        return Float.compare(fish.getWeight(), getWeight()) == 0 && isPredator() == fish.isPredator();
    }

    @Override
    public int hashCode() {
        if (isPredator()) {
            return (int) getWeight() * 2;
        } else {
            return (int) getWeight() * 3;
        }
    }
}