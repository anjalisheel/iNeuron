public class Program {
    public static void main(String[] args) {
        CSE cse = new CSE();
        cse.DeptDetails();
        cse.SubDeptDetails();
        System.out.println();

        ECE ece = new ECE();
        ece.DeptDetails();
        ece.SubDeptDetails();
        System.out.println();

        Dept dept = ece;
        dept.SubDeptDetails();
    }
}
