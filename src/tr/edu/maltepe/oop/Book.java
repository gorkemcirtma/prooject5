package tr.edu.maltepe.oop;

public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public void setName(String name1){
        this.name=name1;
    }
    public String getName(){
        return this.name;
    }
}
