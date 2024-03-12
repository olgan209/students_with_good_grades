public class Student {
    private String surname;
    private String name;
    int math;
    int phi;
    int inform;

    public Student (String surname, String name, int math, int phi, int inform){
        setValues(surname, name, math, phi, inform);
    }

    private void setValues(String surname, String name, int math, int phi, int inform){
        this.surname = surname;
        this.name = name;
        this.math = math;
        this.phi = phi;
        this.inform = inform;
    }

    private void grades(int math, int phi, int inform){

    }
}
