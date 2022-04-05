package tr.edu.maltepe.oop;


import java.util.Vector;

public class Student extends Person {
    private int yas;



    public Student(int id, String name, String surname,int yas) {
        super(id, name, surname);
        this.yas=yas;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
    public String ogrenciNeYapıyor(){
        return getName()+" tenefüste";
    }



    public void swim(Person person,SportCenter sportCenter) {
        if(sportCenter.isInSportCenter(person)){
            System.out.println("Student "+person.getName()+" is swiming in the pool right now");
        }
        else{
            System.out.println("Student "+person.getName()+" can not swiming because he is not in sport center");
        }

    }


    public void playFotball(Person person,  SportCenter sportCenter) {
        if(sportCenter.isInSportCenter(person)){
            System.out.println("Student "+person.getName()+" is playing fotball in the stadium right now");
        }
        else{
            System.out.println("Student "+person.getName()+" can not play fotball because he is not in sport center");
        }
    }

}
