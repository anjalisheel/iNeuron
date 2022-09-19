public abstract class Dept implements Cloneable {

    private String deptId;
    protected String deptType;

    //non abstract methods
    public String getDeptType()
    {
        return deptType;
    }

    public String getDeptId()
    {
        return deptId;
    }

    public void setDeptId(String deptId)
    {
        this.deptId = deptId;
    }

    //abstract methods
    abstract void rank();

    //as a part of cloneable interface
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
