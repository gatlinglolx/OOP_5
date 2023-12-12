import java.util.*;

public class FamilyTreeModelImpl implements FamilyTreeModel {
    private List<Person> persons;

    public FamilyTreeModelImpl() {
        persons = new ArrayList<>();
    }

    @Override
    public void addPerson(Person person) {
        persons.add(person);
    }

    @Override
    public void removePerson(Person person) {
        persons.remove(person);
    }

    @Override
    public void updatePerson(Person person) {
    }

    @Override
    public List<Person> getAllPersons() {
        return persons;
    }
}