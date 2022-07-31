public class Child extends Parent {
    public Child()
    {
        System.out.println("Default ctor : Child class");
    }

    public Child(int num)
    {
        super(20);
        System.out.println("Child class ctor : " + num);
    }
}
