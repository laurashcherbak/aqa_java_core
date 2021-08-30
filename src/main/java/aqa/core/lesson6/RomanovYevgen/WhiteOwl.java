package aqa.core.lesson6.RomanovYevgen;

public class WhiteOwl extends Owl{

    public WhiteOwl() {
        this.id = HomeWork6.num;
        this.isPredator = true;
    }

    public WhiteOwl(float weight) {
        this.wingspan = weight;
        this.id = HomeWork6.num;
        this.isPredator = true;
    }

    @Override
    public void owlSingin() {
        System.out.println("Urr Urr" + getId());
    }
}

