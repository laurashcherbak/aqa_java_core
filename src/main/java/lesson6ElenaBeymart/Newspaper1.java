package lesson6ElenaBeymart;

import java.util.Arrays;

class Newspaper1 {
    String name;
    long id;
    int date;
    boolean isTitle;
    String[] interests;
    public Newspaper1(String name, long id, int date, boolean isTitle, String[] interests){
        this.name = name;
        this.id = id;
        this.date = date;
        this.isTitle = isTitle;
        this.interests = interests;
    }
    @Override
    public int hashCode() {
        int result = 1983;
        result = 31 * result+name.hashCode();
        result = 31 * result + (int) (id ^ (id>>>32));
        result = 31 * result + date;
        result = 31 * result + (isTitle ? 1 : 0);
        result = 31 * result + Arrays.hashCode(interests);
        return result;
    }
}