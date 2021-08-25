package aqa.core.lesson6.IrynaKrechetova;

public class Capital extends Town {

    private String ParlamentAdress;

    public Capital(String Name, int Population, String ZipCode, String ParlamentAdress) {
        super(Name, Population, ZipCode);
        this.ParlamentAdress = ParlamentAdress;
    }

    @Override
    public String toString () {
        return this.getName() + " is a Capital";
    }

    public String getParlamentAdress () {
        return ParlamentAdress;
    }

    public void setParlamentAdress (String newAdress) {
        ParlamentAdress = newAdress;
    }

}
