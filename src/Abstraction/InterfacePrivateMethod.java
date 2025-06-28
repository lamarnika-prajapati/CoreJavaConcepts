package Abstraction;

public interface InterfacePrivateMethod {
    public default void print()
    {
        privateMethod();  // can call priate method into default method
        System.out.println("print parent");
    }
    static void show()
    {

        //privateMethod(); can't call private method into static method, we can call only private static method
        System.out.println("show parent");
        staticPrivateMethod(); // we can call only private static method
    }
    private void privateMethod()
    {
        System.out.println("print private");
    }
    private static void staticPrivateMethod()
    {
        System.out.println("print static private method");
    }

    public static void main(String[] args) {
        InterfacePrivateMethod.show();
        InterfacePrivateMethod.staticPrivateMethod();
    }
}

