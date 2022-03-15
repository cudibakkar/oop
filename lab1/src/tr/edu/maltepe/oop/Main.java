package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {

        Professor obj1 = new Professor();
        Student obj2 = new Student();




        obj2.setstu_ID(56843);
        System.out.println("student id "+ obj2.getstu_ID());
        obj2.learn();



        obj1.SetPro_ID(975424);
        System.out.println(obj1.Getpro_ID());


        //System.out.println("");
    }
}