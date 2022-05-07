package understanding_classes;
public class Constructor {
    int x; // Create an attribute of type int

    //class constructor
    public Constructor() {
        x = 5;
    }
    
    // overload constructor
    public Constructor(int y) {
        x = y;
    }

    public static void main(String[] args) {
        Constructor myObj = new Constructor();
        System.out.println(myObj.x);
        Constructor newObj = new Constructor(55);
        System.out.println(newObj.x);
    }    
}
