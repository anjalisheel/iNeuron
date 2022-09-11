public class Ece extends Dept {
    public Ece()
    {
        deptType = "ECE";
    }

    @Override
    void rank() {
        System.out.println("Inside rank method - ECE class.");
    }
}
