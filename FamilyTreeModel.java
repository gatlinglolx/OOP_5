import java.util.List;

public interface FamilyTreeModel {
    void addPerson(Person person);
    void removePerson(Person person);
    void updatePerson(Person person);
    List<Person> getAllPersons();
}