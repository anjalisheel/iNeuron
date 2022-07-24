public class Program {
    public static void main(String[] args) {
       GrandFather obj1 = new GrandFather();
       obj1.function1();
       System.out.println();

       GrandFather obj2 = new Father();
       obj2.function1();
       System.out.println();

       GrandFather obj3 = new Child();
       obj3.function1();
       System.out.println();

       Father obj4 = new Child();
       obj4.function1();
       obj4.function2();
       System.out.println();

       Child obj5 = new Child();
       obj5.function1();
       obj5.function2();
       obj5.function3();
    }
}
