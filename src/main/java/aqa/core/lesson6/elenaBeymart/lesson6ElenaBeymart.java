package aqa.core.lesson6.elenaBeymart;

public class lesson6ElenaBeymart {
//    private String newspaperName;
//
//    public String ToStringMethod() {
//        public String getNewspaperName () {
//            return newspaperName;
//        }
//        public void setNewspaperName (String newspaperName){
//            this.newspaperName = newspaperName;
//        }
//        public String toString () {
//            StringBuilder sb = new StringBuilder();
//            sb.append("Newspaper Name : ").append(this.newspaperName).append("\n");
//            return sb.toString();
//        }
//        public static void main (String args[]){
//            ToStringMethod method = new ToStringMethod();
//            method.setNewspaperName("Flower");
//            System.out.printIn(method);
//        }
//    }
//}
//class Newspaper {
//    private String name;
//    private int date;
//    Newspaper(String name, int date) {
//        this.name = name;
//        this.date = date;
//    }
//    public boolean equals(Object obj) {
//        if (obj == this) {
//            return true;
//        }
//        if (!(obj instanceof Newspaper)) {
//            return false;
//        }
//        Newspaper nep = (Newspaper) obj;
//        return name.equals(nep.name)&& Integer.compare(date, nep.date) == 0;
//    }
//}
//public class EqualsMethod {
//    public static void main(String[] args) {
//        Newspaper nep1 = new Newspaper("Sea", 1982);
//        Newspaper nep2 = new Newspaper("Sea", 1982);
//        //Comparing the two objects
//        boolean bool = nep1.equals(nep2);
////        System.out.printIn(bool);
//    }
//}
//class Newspaper {
//    String name;
//    long id;
//    int date;
//    boolean isTitle;
//    String[] interests;
//    public Newspaper(String name, long id, int date, boolean isTitle, String[] interests){
//        this.name = name;
//        this.id = id;
//        this.date = date;
//        this.isTitle = isTitle;
//        this.interests = interests;
//    }
//    @Override
//    public int hashCode() {
//        int result = 1983;
//        result = 31 * result+name.hashCode();
//        result = 31 * result + (int) (id ^ (id>>>32));
//        result = 31 * result + date;
//        result = 31 * result + (isTitle ? 1 : 0);
//        result = 31 * result + Arrays.hashCode(interests);
//        return result;
//    }
}
