package tr.edu.maltepe.oop;

public class Professor extends Person {
    private String prof_name;
    private int pro_ID;

    public Professor(String p_name) {

        prof_name=p_name;
    }


    public Professor() {

    }


      public void SetPro_ID(int pi) {

        pro_ID = pi;
    }
    public int Getpro_ID() {
        return pro_ID;

    }
    void teaches () {

        System.out.println("prof"+prof_name+"is teaching now" );
    }
}
