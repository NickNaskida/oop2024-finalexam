package finalexam.task3;

import java.io.*;
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

    public void saveState() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("task3/staff.txt"));
            for (Person person : staff) {
                writer.write(person.toString());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadState() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("task3/staff.txt"));
            staff.clear();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                String name = parts[0];
                String surname = parts[1];
                String personalNumber = parts[2].substring(1, parts[2].length() - 1);
                Person person = new Person(name, surname, personalNumber);
                staff.add(person);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
