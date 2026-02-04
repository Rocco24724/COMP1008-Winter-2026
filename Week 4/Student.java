public class Student {
    public String name;
    public int age;
    public double gpa;
    final String dob;

    public Student(){
        dob = "Jan 1";
    }

    public Student(String dob){
        this.dob = dob;
    }

    public static Student MatureStudent(String name, String dob, int age, double gpa){

        Student s = new Student();
        s.name = name;
        s.age = age >=30 ? age : 35; //tenary operators
        s.age = Math.max(30, age);

        return s;
    }
}
