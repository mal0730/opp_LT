public class Student extends Person {
    public Student(int birthYear, String name) {
        super(birthYear, name);
    }
    private int id;
    public Student(int birthYear, String name, int id) {
        super(birthYear, name);
        this.id = id;
    }
    public Student(Student s) {
        super(s);
        this.id = s.id;
    }
}
