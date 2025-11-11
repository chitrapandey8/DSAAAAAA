package OOps;

public class Dog {
    private String name;
    String breed;
    int age;

    void greetdog(){
         System.out.println("hello" + this.name);
     }

     Dog(String name, int age, String breed){
        this.name = name;
        this.breed = breed;
        this.age = age;
     }


     //getter
     String getname(){
        return name;
     }

     //seter
    void setname(String name){
        this.name = name;
    }

}
