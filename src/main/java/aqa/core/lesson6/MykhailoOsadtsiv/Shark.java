package aqa.core.lesson6.MykhailoOsadtsiv;

import java.util.Objects;

public class Shark extends Fish{
    private int eatenFishsCount;
    public Shark() {
  //      this.id = HomeWork6.index;
        this.isPredator = true;
        this.eatenFishsCount = 0;
    }

    public Shark(float weight) {
        this.weight = weight;
   //     this.id = HomeWork6.index;
        this.isPredator = true;
        this.eatenFishsCount = 0;
    }

    @Override
    public void fishSays() {
        System.out.println("ARRRGH ");
    }

    public void eatFish(Fish a) {
        this.weight += a.weight / 10;
        this.eatenFishsCount++;
        a = null;   //як зробити, щоб акула знищувала об"єкт риби який їсть?
        System.gc();//
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shark)) return false;
        if (!super.equals(o)) return false;
        Shark shark = (Shark) o;
        return eatenFishsCount == shark.eatenFishsCount;
    }

    @Override
    public int hashCode() {
        return (super.hashCode() + eatenFishsCount * 5);
    }
}

