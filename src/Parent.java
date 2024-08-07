public class Parent extends Person{
    private String job;

    public Parent (String name, int age, String relationship, String complexion, String behavior, String illness, String job){
        super(name, age, relationship, complexion, job);
        this.job = job;
        
    }

    public String getJob(){
        return job;
    }


    @Override
    public void traits(){
        super.traits();
        System.out.println("My job is : " + job);
    }
    
}
