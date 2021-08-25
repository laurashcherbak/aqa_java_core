package aqa.core.lesson6.MykhailoOsadtsiv;

public class Shark extends Fish{
    public Shark() {
        this.id = HomeWork6.index;
        this.isPredator = true;
    }

    public Shark(float weight) {
        this.weight = weight;
        this.id = HomeWork6.index;
        this.isPredator = true;
    }

    @Override
    public void fishSays() {
        System.out.println("ARRRGH " + getId());
    }

    public void eatFish(Fish a) {
        this.weight += a.weight / 10;
        a = null;   //як зробити, щоб акула знищувала об"єкт риби який їсть?
        System.gc();//
    }
}
