package tr.edu.maltepe.oop;

import java.util.Vector;

public class SportCenter {
    private Vector<Person> vec = new Vector<Person>();
    public SportCenter(){


    }
    public void goSportCenter(Person person){
        this.vec.add(person);
    }
    public void exitSportCenter(Person person){
        this.vec.remove(person);
    }
    public boolean isInSportCenter(Person person) {
        boolean is=false;//
        for (int i = 0; i < this.vec.size(); i++) {
            if (this.vec.get(i) == person) {
                is=true;
            }
        }
        if(is){
            return true;
        }
        else{
            return false;
        }

    }
}
