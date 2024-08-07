public class Person {
    private String name;
    private int age;
    private String relationship;
    private String complexion;
    private String height;


    public Person (String name, int age, String relationship, String complexion, String height ){
        this.name = name;
        this.age = age;
        this.relationship = relationship;
        this.complexion = complexion;
        this.height = height;
    }

    void traits(){
        System.out.println("My name is : " +name);
        System.out.println("My age is : " +age);
        System.out.println("My relationship with Aneesha is  : " +relationship);
        System.out.println("I am : " +height);
        System.out.println("My complextion is : " +complexion);
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getRelationship(){
        return relationship;
    }

    public String getComplexion(){
        return complexion;
    }

    public String getHeight(){
        return height;
    }


}
