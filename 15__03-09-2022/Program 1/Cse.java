public class Cse extends Dept {
    public Cse()
    {
        deptType = "CSE";
    }

    @Override
    void rank() {
        System.out.println("Inside rank method - CSE class.");
    }
}
