public class Teacher {
    private int birthYear;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Teacher(int birthYear, String name) {
        this.birthYear = birthYear;
        this.name = name;
    }
    public Teacher(Teacher t) {
        this.birthYear = t.birthYear;
        this.name = t.name;
    }
}
