package tr.edu.maltepe.oop;
import java.util.*;
public class Library {
    private Vector<Book> vec = new Vector<Book>();

    public Library(){

    }
    public Vector<Book> getBooks(){
        return this.vec;
    }
    public void AddBook(Book bookk ){

        getBooks().add(bookk);
    }
    public void removeBook(Book book2){
        getBooks().remove(book2);
    }
    public void landBook(Book book,Person person1){
        person1.AddBook(book);
        getBooks().remove(book);


    }

}
