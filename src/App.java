public class App {
    public static void main(String[] args) throws Exception {
        FamilyTree familyTree = new FamilyTree();

        GreatGrandParents GreatGrandFather = new GreatGrandParents("Soobramoney", 85, "Great Grand Father", "Fair");
        GreatGrandParents GreatGrandMother = new GreatGrandParents("Ambi", 86, "Great Grand Mother", "Fair");
        GrandParents GrandFather = new GrandParents("Murgas", 81, "Grand Father", "Fair", "Outgoing", "Diabetic");
        GrandParents GrandMother = new GrandParents("Priscilla", 71, "Grand Mother", "Fair", "Humble", "Diabetic");
        Parent Father = new Parent("Deena", 53, "Father", "Fair", "Humble", "Hypertension", "Cost Controller");
        Parent Mother = new Parent("Rani", 51, "Mother", "Fair", "Outgoing", "None", "Educator");
        Child Daughter = new Child("Aneesha", 27, "Daughter", "Fair", "Humble", "Black");

        familyTree.addMember(GreatGrandFather);
        familyTree.addMember(GreatGrandMother);
        familyTree.addMember(GrandFather);
        familyTree.addMember(GrandMother);
        familyTree.addMember(Father);
        familyTree.addMember(Mother);
        familyTree.addMember(Daughter);

        familyTree.displayFamilyTree();

    }
}
