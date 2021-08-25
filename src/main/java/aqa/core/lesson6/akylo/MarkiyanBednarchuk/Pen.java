package aqa.core.lesson6.akylo.MarkiyanBednarchuk;

public class Pen {
    public String type;
    public int numberOfUses;

    public Pen(String type, int numberOfUses) {
        this.type = type;
        this.numberOfUses = numberOfUses;
    }
    public Pen(String type){
        this.type = type;
        this.numberOfUses = 1000;
    }
    public  String getType(){
        return type;
    }
    public void setType(){
        this.type = type;
    }
    public int getNumberOfUses(){
       return numberOfUses;
    }
    public void setNumberOfUses(int i){
        this.numberOfUses = numberOfUses;
    }
    public String toString() {
        return "Pen:" +
                "type -'" + type + '\'' +
                ", number of uses - " + numberOfUses;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pen)) return false;
        Pen pen = (Pen) o;
        return numberOfUses == pen.numberOfUses && type.equals(pen.type);
    }
    public int hashCode() {
        int result = type == null ? 0 : type.hashCode();
        result = 31 * result + numberOfUses;
        return result;
    }

}

