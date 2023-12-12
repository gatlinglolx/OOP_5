import java.util.List;

public class FamilyTreePresenterImpl implements FamilyTreePresenter {
    private FamilyTreeModel model;
    private FamilyTreeView view;

    public FamilyTreePresenterImpl(FamilyTreeModel model, FamilyTreeView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void addPerson(Person person) {
        model.addPerson(person);
    }

    @Override
    public void removePerson(Person person) {
        model.removePerson(person);
    }

    @Override
    public void updatePerson(Person person) {
        model.updatePerson(person);
    }

    @Override
    public void getAllPersons() {
        List<Person> persons = model.getAllPersons();
        view.showPersons(persons);
    }
}