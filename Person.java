public class Person {
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

    public Person(int birthYear, String name) {
        this.birthYear = birthYear;
        this.name = name;
    }
    public Person(Person p) {
        this.birthYear = p.birthYear;
        this.name = p.name;
    }
}
