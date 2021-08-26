package aqa.core.lesson6.YuliiaAvrakhova;

public class Song {
    protected String name;
    protected String style;
    protected int duration;

    public Song(){
    }

    public Song(String name){
        this.name=name;
    }

    public Song(int duration){
        this.duration=duration;
    }

    public Song(String name, String style){
        this.name=name;
        this.style=style;
    }

    public Song(String name, String style, int duration){
        this.name=name;
        this.style=style;
        this.duration=duration;
    }

    public void play(){
        System.out.println("Playing song "+name+" song " + duration + " seconds");
    }

    public void changeStyle(String style){
        this.style = style;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", style='" + style + '\'' +
                ", duration=" + duration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;

        Song song = (Song) o;

        if (duration != song.duration) return false;
        if (name != null ? !name.equals(song.name) : song.name != null) return false;
        return style != null ? style.equals(song.style) : song.style == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (style != null ? style.hashCode() : 0);
        result = 31 * result + duration;
        return result;
    }
}

//class Main{
//    public static void main(String[] args) {
//        Symphony s = new Symphony("song1", "rock", 10, "bethoven");
//        Symphony s1 = new Symphony("song1", "rock", 10, "bethoven");
//        s.changeStyle("jazz");
//        s.play();
//        s.learn();
//        System.out.println(s.equals(s1));
//        System.out.println(s.hashCode());
//        System.out.println(s);
//    }
//}
