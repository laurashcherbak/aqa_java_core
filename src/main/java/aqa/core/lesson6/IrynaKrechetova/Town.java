package aqa.core.lesson6.IrynaKrechetova;


public class Town {
    private String Name;
    private int Population;
    private String ZipCode;

    public void setName(String newName)
    {
        this.Name = newName;
    }

    public String getName() {
        return this.Name;
    }

    public boolean IsMame (String newName) {
        return newName.equals(this.Name);
    }

    public void AddPeople (int newPeople) {
        this.Population = this.Population + newPeople;
    }

    public Town (String Name, int Population, String ZipCode) {
        this.Name = Name;
        this.Population = Population;
        this.ZipCode = ZipCode;
    }

    public Town (String Name, int Population) {
        this.Name = Name;
        this.Population = Population;
        this.ZipCode = "00000";
    }

    public Town (String Name) {
        this.Name = Name;
        this.Population = 0;
        this.ZipCode = "00000";
    }

    public Town () {
        this.Name = "no name";
        this.Population = 0;
        this.ZipCode = "00000";
    }

    @Override
    public String toString () {
        return this.Name;
    }

    @Override
    public boolean equals (Object otherTown) {
        if (this == otherTown) return true;

        if (otherTown == null || getClass() != otherTown.getClass())
            return false;

        Town town = (Town) otherTown;
        if (!this.Name.equals(town.Name)){
            return false;
        }

        if (this.Population != town.Population)
            return false;

        if (!this.ZipCode.equals(town.ZipCode)) {
            return false;
        }

        return true;

    }

    @Override
    public int hashCode() {

        int result = this.Population;
        if (this.Name != null) {
            result = result + this.Name.hashCode();
        }
        if (this.ZipCode != null) {
            result = result + this.ZipCode.hashCode();
        }
        return result;
    }

}


