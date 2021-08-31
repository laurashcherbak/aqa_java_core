package aqa.core.lesson9.MykhailoOsadtsiv.alishev;

import java.io.Serializable;

public class Person implements Serializable {
 //   private static final long serialVersionUID = -3496793561747124575L;  //для файлів на тривалому зберіганні на випадок змін у структурі класу

    private int id;
    private transient String name;  //transient ==  !Serializable for field

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + ":" + name;
    }
}
