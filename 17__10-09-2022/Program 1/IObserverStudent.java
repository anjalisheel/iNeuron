public interface IObserverStudent {
    //This method can be used to update the students
    public void update();

    //Inform students about the class
    public void setClass(ISession session);

    //this returns topic name to be discussed
    public String getName();
}
