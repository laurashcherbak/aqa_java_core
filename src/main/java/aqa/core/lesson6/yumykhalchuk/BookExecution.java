package aqa.core.lesson6.yumykhalchuk;

public class BookExecution {
    public static void main(String[] args) {
        Book book1 = new Book("I want, I can", "Labkovsky", 180.5, 300);
        //Book book3 = new Book("A Woman Makes a Plan", 210.75);
        //System.out.println(book1.author);
        //System.out.println(book2.price);
        EBook eBook1 = new EBook("Thinking in java", "Bruce Eckel", 390, "https://www.amazon.com/", 85);
        EBook eBook3 = new EBook("Psychology", 50);
        eBook1.printAllInfo();
        eBook3.printGenre();
        //System.out.println(eBook1.toString());
        //System.out.println(book1.toString());
        //System.out.println(book2.equals(book1));
        //System.out.println(book1.hashCode());
        //System.out.println(book2.hashCode());
    }
}
