import java.util.*;

public class Main {
    public static void main(String[] args) {
        FamilyTreeModel model = new FamilyTreeModelImpl();
        FamilyTreeView view = new FamilyTreeViewImpl();
        FamilyTreePresenter presenter = new FamilyTreePresenterImpl(model, view);

        Person person1 = new Person("Vlad", new Date(1999));
        Person person2 = new Person("Chrice", new Date (2003));
        presenter.addPerson(person1);
        presenter.addPerson(person2);

        presenter.getAllPersons();
    }
}