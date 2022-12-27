package OOPFundamentalsInheritanceReview;

// to pass on all the features/methods that our generic mouse (class has) we need to add "extends" then the class in this
//case it is Mouse
public class Mouse1 extends Mouse{
    String texture = "Matte";

    public static void setColor(String color){
        System.out.println(color);
    }
}
