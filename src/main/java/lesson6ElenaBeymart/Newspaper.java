package lesson6ElenaBeymart;

class Newspaper {
    private String name;
    private int date;
    Newspaper(String name, int date) {
        this.name = name;
        this.date = date;
    }
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Newspaper)) {
            return false;
        }
        Newspaper nep = (Newspaper) obj;
        return name.equals(nep.name)&& Integer.compare(date, nep.date) == 0;
    }
}