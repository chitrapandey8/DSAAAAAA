package OOps;

public class Dogobject {
    public static void main(String[] args) {
        Dog d1 = new Dog("brunoo", 21, "german");
        d1.breed = "plutoo";

//        System.out.println(d1.breed);
        //System.out.println(d1.name);

//        d1.greetdog();
//        System.out.println(d1.greetdog());

            /// using getter(display name)
        System.out.println(d1.getname());

        //useing setetr(set name)
        d1.setname("kuchbhi");
        System.out.println(d1.getname());



    }
}
