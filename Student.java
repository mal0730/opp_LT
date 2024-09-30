public class Student {
    private int birthYear;
    private String name;
    private int id;

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(int birthYear, String name, int id) {
        this.birthYear = birthYear;
        this.name = name;
        this.id = id;
    }
    public Student(Student s) {
        this.birthYear = s.birthYear;
        this.name = s.name;
        this.id = s.id;
    }
}
