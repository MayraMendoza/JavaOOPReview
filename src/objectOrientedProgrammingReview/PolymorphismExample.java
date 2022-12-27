package objectOrientedProgrammingReview;

/**
 * Polymorphism example using inheritance
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
