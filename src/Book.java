import java.util.ArrayList;

public class Book {

    String title;
    String author;
    String edition;                     //ändrat till String så man kan ta emot stad, publisher och år
    boolean available;

    public Book(String title,String author, String edition, boolean available){

        this.title = title;             //la till blanksteg
        this.author = author;
        this.edition = edition;
        this.available = available;     //la till blanksteg

    }

    public void setAvailable(boolean available) {
        this.available = available;
        if (available == false) { System.out.println("the book is not available");
        } else  { System.out.println("the book is  available");} }

        public String toString()  {


            return "Title: "+ this.title+"\n"+
                    " Author: " + this.author+"\n"+
                    " Editon: "+ this.edition+"\n" ;
        }
        /*public Book (String title,String author, int edition)  {
        this.title =title;
        this.author = author;
        this.edition = edition;
        this.available= true;*/                         //ny konstruktör? den ligger iaf inuti setAvailable, bör vara ute

}

    public String getTitle() {
        return title;
    }
}
