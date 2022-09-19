public class ServiceBased implements IJobChain {
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
        if(person.getSkillType().equals("Service"))
        {
            System.out.println("Got selected in service based company");
        }
        else {
            System.out.println("Got rejected in service based company");
            System.out.println("Need to prepare more");
        }
    }
}
