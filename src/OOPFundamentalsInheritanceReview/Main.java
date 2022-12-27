package OOPFundamentalsInheritanceReview;

//Inheritance Example
public class Main {
    public static void main(String[] args) {
        Mouse1 m1= new Mouse1();
        // since Mouse 1 extends Mouse (Inherits from Mouse class) Mouse 1 now has all features/methods associated with Mouse

        m1.leftClick();
        m1.rightClick();
        m1.scrollUp();
        m1.scrollDown();

        Mouse2 m2= new Mouse2();
        m2.leftClick();
        m2.rightClick();
        m2.scrollUp();
        m2.scrollDown();
        // Each class that inherits from parent class will have all parent methods as well as their own methods.
        m2.connect();

    }
}
