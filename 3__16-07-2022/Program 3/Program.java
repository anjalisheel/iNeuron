public class Program {
    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.add(1,2));
        System.out.println(s.add(10,20,30));
        System.out.println(s.add(1.1f, 2.2f));
        System.out.println(s.add(10, 2.3f));
        System.out.println(s.add(1.1f, 2.2f, 3.4f));
    }
}
