public class Demo implements IDemo1, IDemo2 {
    @Override
    public void Print() {
        System.out.println("Print function");
    }

    @Override
    public void Display() {
        System.out.println("Display function");
    }
}
