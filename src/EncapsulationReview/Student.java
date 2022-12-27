package EncapsulationReview;

//student object
public class Student {
    private String name;
    private int age;

    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
