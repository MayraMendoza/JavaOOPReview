package OOPFundamentalsPolymorphismRewiew;

/**
 * Polymorphism example using inheritance
 * Polymorphism- Means many forms (of a method).
 * Java class can do the same thing in different ways.
 * override - example original bird can sign by going "tweet tweet tweet". But not all birds will sing the same.
 * when extending the bird class to robin or pelican you can override sing method from the parent class. to override you
 * have to implement the exact same method signature as the parent method.
 *
 * (Method in the child class override a method in the parent class) (resulting in doing the same thing in a different form)
 *
 *
 * Other form of polymorphism METHOD OVERLOADING
 * when you have two methods in a class with the same name but take different parameters.
 * you can't have the same exact methods but you can have many methods with the same name that take different parameters.
 */
class Bird {
    public void sing() {
        System.out.println("tweet, tweet, tweet");
    }
}

class Robin extends Bird{
    // the class robin knows two sing methods, it will prioritize the one directly in the class.
    // polymorphism - it knows many verison of sing, but it will prioritize the one in the child class (by overriding )
    public void sing() {
        System.out.println("Twiddledeedee");
    }

}

class pelican extends Bird{
    // polymorphism method overloading example - methods with the same names but take different parameters
    public void sing() {
        System.out.println("KWAAH KWAAAAH KWHAAAH!!!");
    }
    public void sing(int times) {
        for(int i=0; i<times;i++ ){
            System.out.println("KWAAH KWAAAAH KWHAAAH!!!");
        }

    }

}



 public class PolymorphismExample {
     public static void main(String[] args) {
         Robin b= new Robin();
         // method overriding - s.sing in the robin class will override sing method from its parent class (bird)_
         b.sing();

         // method overloading - same method name with different parameters
         pelican a = new pelican();
         a.sing();
         a.sing(5);



     }


}
