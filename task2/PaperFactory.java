package finalexam.task2;

import java.util.ArrayList;
import java.util.List;

public class PaperFactory {
    private List<Person> staff = new ArrayList<>();

    public void addPerson(Person p) {
        staff.add(p);
    }

    public boolean deletePerson(Person p) {
        for (Person person : staff) {
            if (person.equals(p)) {
                staff.remove(person);
                return true;
            }
        }

        return false;
    }

    public List<Person> getStaff() {
        return staff;
    }
}
