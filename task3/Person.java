package finalexam.task3;

public class Person {
    String name, surname, personalNumber;

    public Person(String name, String surname, String personalNumber) {
        this.name = name;
        this.surname = surname;
        this.personalNumber = personalNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return this.personalNumber.equals(p.personalNumber);
        }
        return false;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + personalNumber + ")";
    }
}
