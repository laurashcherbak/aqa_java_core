package aqa.core.lesson6.yumykhalchuk;

public class EBook extends Book{
    public String siteOfDownload;
    public int sizeMB;


    public EBook(String title, String author, double price, String siteOfDownload, int sizeMB){
        super(title, author, price);
        this.siteOfDownload = siteOfDownload;
        this.sizeMB = sizeMB;
    }
    public EBook(String genre, int sizeMB){
        super(genre);
        this.sizeMB = sizeMB;
    }

    public void printTitle(){
        System.out.print("The title of this book is: "+ title);
    }
    public void printAllInfo(){
        System.out.println("All info about book is: " + title + " " + author + " " + price +" " + siteOfDownload + " " + sizeMB);
    }

    @Override
    public void printGenre() {
        super.printGenre();
        System.out.println(" " + "it has" + " " + sizeMB + " " + "Mb" + " " + "in electronic version");
    }

    @Override
    public String toString() {
        return "EBook{" +
                "siteOfDownload='" + siteOfDownload + '\'' +
                ", sizeMB=" + sizeMB +
                '}';
    }

}
