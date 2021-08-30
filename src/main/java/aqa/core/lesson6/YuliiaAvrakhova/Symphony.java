package aqa.core.lesson6.YuliiaAvrakhova;

public class Symphony extends Song {

    private String author;

    public Symphony(String name, String style, int duration, String author){
        super(name, style, duration);
        this.author = author;
    }

    public void learn(){
        System.out.println("Trying to learn symphony " + name +" of " + author);
    }

    @Override
    public void play(){
        System.out.println("Playing symphony of "+author + " " + duration + " seconds");
    }

    @Override
    public String toString() {
        return "Symphony{" +
                " name='" + name + '\'' +
                ", style='" + style + '\'' +
                ", duration='" + duration + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Symphony)) return false;
        if (!super.equals(o)) return false;

        Symphony symphony = (Symphony) o;

        return author != null ? author.equals(symphony.author) : symphony.author == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }
}

