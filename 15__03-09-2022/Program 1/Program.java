public class Program {
    public static void main(String[] args) throws CloneNotSupportedException {
        //load all the backups created
        DeptCache.loadDeptCache();

        Dept clonedEce = DeptCache.getDeptDetails("ECE");
        clonedEce.rank();
        System.out.println("Dept name : " + clonedEce.getDeptType());

        Dept clonedCse = DeptCache.getDeptDetails("CSE");
        clonedCse.rank();
        System.out.println("Dept name : " + clonedCse.getDeptType());
    }
}