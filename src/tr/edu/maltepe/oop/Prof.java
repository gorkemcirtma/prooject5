package tr.edu.maltepe.oop;

import java.util.Vector;

public class Prof extends Person {
    private String unvan;
    public Prof(int id, String name, String surname,String unvan) {
        super(id, name, surname);
        this.unvan=unvan;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
    public String profNeYapıyor(){
        return getName()+" derste";
    }




    public void swim(Person person,SportCenter sportCenter) {
        if(sportCenter.isInSportCenter(person)){
            System.out.println("Prof "+person.getName()+"is swiming in the pool right now");
        }
        else{
            System.out.println("Prof "+person.getName()+"can not swiming because he is not in sport center");
        }

    }

    public void playFotball(Person person,SportCenter sportCenter) {
        if(sportCenter.isInSportCenter(person)){
            System.out.println("Prof "+person.getName()+" is playing fotball in the stadium right now");
        }
        else{
            System.out.println("Prof "+person.getName()+" can not play fotball because he is not in sport center");
        }
    }
}
