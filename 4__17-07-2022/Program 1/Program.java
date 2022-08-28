public class Program {
    public static void main(String[] args) {
        //creating instance of static class
        OuterClass.StaticClass staticClass = new OuterClass.StaticClass();
        staticClass.printStaticClass();
        OuterClass.StaticClass.printMessage();

        //for a non static class

        //another approach for these two statements
        /**
         * OuterClass outer = new OuterClass();
         *         OuterClass.InnerClass inner = outer.new InnerClass();
         */

        OuterClass.InnerClass inner = new OuterClass().new InnerClass();

        inner.printInnerClass();
    }
}
