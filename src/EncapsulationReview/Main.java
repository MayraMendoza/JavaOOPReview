package EncapsulationReview;

public class Main {
    public static void main(String[] args) {
        Student m = new Student();
        // we can set name and age in the main method
        // but this is not a good practice/we want to call methods that do this for use-- instead of us typing it our everytime "m.name = mayra" and so on
        // to get around this we will add getters and setters to the student class.

//        m.name ="Mayra";
//        m.age =20;
//        System.out.println(m.name);
//        System.out.println(m.age);
        m.setName("James");
        System.out.println(m.getName());

        // student object m knows everything inside of the student class, when we set name - it will set name to james.

        m.setAge(25);
        System.out.println(m.getAge());

    }
}
