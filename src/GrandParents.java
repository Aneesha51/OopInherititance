public class GrandParents extends Person{
    String behavior;
    String illness;

    public GrandParents(String name, int age, String relationship, String complexion, String behavior, String illness){
       super(name, age, relationship, complexion, illness);
        this.behavior = behavior;
        this.illness = illness;
    }

    public String getBehavior(){
        return behavior;
    }


    public String getIlleness(){
        return illness;
    }

    @Override
    void traits(){
        super.traits();
        System.out.println("My behavior is : " + behavior);
        System.out.println("The illness that i have is : " +illness);
    }

}