public interface IJobChain {
    //setting the next job
    public void setNextChain(IJobChain jobChain);

    /*
    Helps person to get job
    1. MAANG
    2. Product based
    3. Service based
    * */
    public void getJob(Person person);
}
