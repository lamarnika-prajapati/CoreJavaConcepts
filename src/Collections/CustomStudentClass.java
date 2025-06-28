package Collections;

public class CustomStudentClass {
    int rollno;
    String name;
    String college;

    public CustomStudentClass(int rollno, String name, String college) {
        this.rollno = rollno;
        this.name = name;
        this.college = college;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getCollege() {
        return college;
    }

   /* @Override
    public String toString() {
        return ("Rollno: " + getRollno() + " Name: " + getName() + " College: " + getCollege());
    }*/


}
