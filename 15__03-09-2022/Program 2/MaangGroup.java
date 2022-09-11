public class MaangGroup implements IJobChain {
    //knows who is the next in the job chain
    private IJobChain jobChain;

    //this method will be used for setting the next job
    @Override
    public void setNextChain(IJobChain jobChain) {
        this.jobChain = jobChain;
    }

    //this method will be used for getting the job
    @Override
    public void getJob(Person person) {
        if(person.getSkillType().equals("MAANG"))
        {
            System.out.println("Got selected in MAANG group");
        }
        else {
            System.out.println("Got rejected in MAANG group");
            System.out.println("Applying for product based companies");
            this.jobChain.getJob(person);
        }
    }
}
