public class Child extends Person {
    
    private String hairColour;
  
    
    public Child(String name, int age, String relationship, String complexion,String behavior, String hairColour){
        super(name, age, relationship, complexion, hairColour);
        this.hairColour = hairColour;
       

    }

    public String getHairColour(){
        return hairColour;
    }

  
    @Override
    public void traits(){
        super.traits();
        System.out.println("My hair colour is : " + hairColour);
        System.out.println("I have inherited the complextion from all of my family members");
        
    }

    
}
