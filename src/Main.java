import java.util.ArrayList;
import java.util.Scanner;



public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Book b1 = new Book("Pippi","Astrid Lindgren",3,true);
        Book b2= new Book("Steppenwolf", "Herrmann Hesse",2,true);
        Book b3 = new Book("Gröna växeter","Gröna Tanten",4,true);
        Book b4= new Book("Minimalism", "Minsta Minstingen",2,true);
        Book b5= new Book("Den moderna häxan","Hedwig Häxstumpa", 1,true);
        Book b6 = new Book("Tomatoe tomato","Engela Americano",4,true);
        Book b7= new Book("Var inte rädd", "Anxeita Räddsson",2,false);
        Book b8= new Book("Vad ska jag äta, egentligen","Dietista Metabolica", 1,true);


        ArrayList<Book> books = new ArrayList<>(); //tog bort java.utils
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        books.add(b6);
        books.add(b7);
        books.add(b8);

        while (true) {
            System.out.println("Hello, thank you for visiting our library - What do you want to do?\n" +
                "1. Add a book to the library\n" + //scanner in + parameter utan available
                "2. Search for a book by name\n" + //
                "3. List all available books\n" + // System outprint books men bara if available
                "4. Return a book\n" + // ta in namn på book och sätta available från false to true
                "5. Quit\n"); // hoppa ur menyn

            int val = sc.nextInt();
            sc.nextLine();

            if (val == 1){
                
                //Nya grejer i listan hamnar alltid i listans sista plats så man kan nå dem med lista.size()-1 inuti lista.get(). 
                //Man behöver således inte ange nya variabelnamn

                books.add(new Book("","","",""));
                System.out.println("Insert book title:");
                books.get(books.size()-1).title = sc.nextLine();
                System.out.println("Insert book author:");
                books.get(books.size()-1).author = sc.nextLine();
                System.out.println("Insert publishing year:");
                books.get(books.size()-1).year = sc.nextLine();
                System.out.println("Insert publisher details:");
                books.get(books.size()-1).edition = sc.nextLine();
                
            } else if ( val ==2) { System.out.println("What's the title of the book you are searching for?");
                    String searchedTitle = sc.nextLine();

                    // skapa method som kolla på om det finns en book med liknande titel finns och if ja== print out atributerna
                // om nej " We are sorry we do not have own this book.
                // irretera genom titlarna

                if (books.contains(searchedTitle)) {
                    System.out.println("found it");
                }

            } else if (val == 3) {  System.out.println(books);

            } else if (val == 4){  System.out.println("What book do you want to return");
                String title = sc.nextLine(); // - boken ska finnas - ignore case, status ska ändras

            } else if (val == 5){  System.out.println("Thank you for visiting"); break;



        }else {System.out.println("no valid input");

        }}}}
