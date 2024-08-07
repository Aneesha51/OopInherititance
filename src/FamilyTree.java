import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<Person> familyMembers;

    public FamilyTree(){
        familyMembers = new ArrayList<>();
    }

    public void addMember(Person person){
        familyMembers.add(person);
    }

    public void displayFamilyTree(){
        for (Person person : familyMembers){
            person.traits();
            System.out.println("----------------------------------------------------------------------------------");
        }
    }
}
