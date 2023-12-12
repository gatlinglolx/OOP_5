import java.util.List;

public class FamilyTreeViewImpl implements FamilyTreeView {
    @Override
    public void showPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Name: " + person.getName());
            System.out.println("Birth Date: " + person.getBirthDate());
            System.out.println("----------------------");
        }
    }

    @Override
    public void showErrorMessage(String message) {
        System.out.println("Error: " + message);
    }
}