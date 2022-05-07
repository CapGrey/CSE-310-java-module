package understanding_classes;

public class ExperiementsMain {
    int x = 5;
    int y = 3;

    // static method can be called w/o creating objects.
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }
  
    // Public method must be called through an object
    public void myPublicMethod() {
      System.out.println("Public methods must be called by creating objects");
    }
    public static void main(String[] args) {
        ExperiementsMain myObj = new ExperiementsMain();
        System.out.println(myObj.x);
        myStaticMethod();
        myObj.myPublicMethod();
    } 
}


