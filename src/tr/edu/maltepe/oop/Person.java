package tr.edu.maltepe.oop;

import java.util.Vector;

public class Person implements DoSport {
    private int id;
    private String name;
    private String surname;
    protected Vector<Book> vec = new Vector<Book>();


    public Person(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public Vector<Book> getBooks(){
        return this.vec;
    }
    public void AddBook(Book book1 ){

        getBooks().add(book1);
    }
    public void removeBook(Book book2){
        getBooks().remove(book2);
    }
    public void returnBook(Book book,Library library1){
        library1.AddBook(book);
        getBooks().remove(book);

    }
    @Override
    public void playFotball(){}
    @Override
    public void swim(){}


}