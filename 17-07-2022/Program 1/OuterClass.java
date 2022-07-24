public class OuterClass {
    //static class
    public static class StaticNestedClass
    {
        public void printMsg()
        {
            System.out.println("Hello world");
        }
    }

    //non static nested class
    public class InnerClass
    {
        public void display()
        {
            System.out.println("Non static class");
        }
    }
}
