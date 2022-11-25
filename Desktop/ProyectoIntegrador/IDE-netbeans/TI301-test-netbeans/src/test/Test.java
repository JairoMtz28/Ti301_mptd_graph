package test;

public class Test {
    
    public static void main(String[] args) {
        Triangle triDefault = new Triangle();
        
        System.out.println(triDefault);
        System.out.println("Area: " + triDefault.computeArea());
        
        Triangle triParams = new Triangle(2.0, 3.0);
        
        System.out.println(triParams);
        System.out.println("Area: " + triParams.computeArea());
    }
    
}
