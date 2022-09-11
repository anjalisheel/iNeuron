import java.util.Hashtable;

public class DeptCache {
    private static Hashtable<String, Dept> deptHashtable = new Hashtable<>();

    //acting like creating backup
    /*
    here we are creating dept cache based upon dept id
    * */
    public static Dept getDeptDetails(String deptId) throws CloneNotSupportedException {
        Dept cachedDept = deptHashtable.get(deptId);
        return (Dept) cachedDept.clone();
    }

    //acting like restoring backup
    /*
    here we are creating cache hashtable
    * */
    public static void loadDeptCache()
    {
        Cse cse = new Cse();
        cse.setDeptId("CSE");
        deptHashtable.put(cse.getDeptId(), cse);

        Ece ece = new Ece();
        ece.setDeptId("ECE");
        deptHashtable.put(ece.getDeptId(), ece);
    }
}
