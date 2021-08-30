package aqa.core.lesson6.virakrychkovska;

public class Sea {
//    public class Sea {
        private String Name;
        private int Temperature;

        public void setName(String newName) {
            this.Name = newName;
        }

        public String getName() {
            return this.Name;
        }

        public boolean IsName(String newName) {
            return newName.equals(this.Name);
        }

        public void AddDeegre(int newDegree) {
            this.Temperature = this.Temperature + newDegree;
        }

//        public Sea(String Name, int Temperature) {
//            this.Name = Name;
//            this.Temperature = Temperature;
//        }
//
//        public Sea(String Name, int Temperature) {
//            this.Name = Name;
//            this.Temperature = Temperature;
//        }

        public Sea(String Name) {
            this.Name = Name;
            this.Temperature = 0;
        }

        public Sea() {
            this.Name = "no name";
            this.Temperature = 0;
        }

        @Override
        public String toString() {
            return this.Name;
        }

        @Override
        public boolean equals (Object otherSea) {
            if (this == otherSea) return true;

            if (otherSea == null || getClass() != otherSea.getClass())
                return false;

            Sea town = (Sea) otherSea;
            if (!this.Name.equals(town.Name)){
                return false;
            }

            if (this.Temperature != town.Temperature)
                return false;
            return true;
        }
//    }
    @Override
    public int hashCode() {

        int result = this.Temperature;
        if (this.Name != null) {
            result = result + this.Name.hashCode();
        }
        return result;
    }
}

