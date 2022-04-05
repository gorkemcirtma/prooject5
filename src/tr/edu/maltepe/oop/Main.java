package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {
        Prof prof1 = new Prof(3421, "gorkem", "cirtma","prof");
        Student student1 = new Student(4687, "gizem", "aydın",19);

        SportCenter sportCenter = new SportCenter();
        student1.swim(student1,sportCenter);
        prof1.playFotball(prof1,sportCenter);
        sportCenter.goSportCenter(student1);
        sportCenter.goSportCenter(prof1);
        student1.swim(student1,sportCenter);
        prof1.playFotball(prof1,sportCenter);


    }

}