import java.util.ArrayList;
import java.util.List;

public class Batch implements ISession {
    List<IObserverStudent> registeredStudents;
    private String studyTopic;

    public Batch()
    {
        //in the beginning there will be no students
        this.registeredStudents = new ArrayList<>();
    }

    //Method to register for the new class
    @Override
    public void register(IObserverStudent student) {
        System.out.println("Registering student : " + student.getName());
        this.registeredStudents.add(student);
    }

    //Method to unregister from the class
    @Override
    public void unregister(IObserverStudent student) {
        System.out.println("Removing student : " + student.getName());
        this.registeredStudents.remove(student);
    }

    //Method to notify all the registered students about the new class
    @Override
    public void notifyStudents() {
        for (IObserverStudent observerStudent : registeredStudents)
        {
            observerStudent.update();
        }
    }

    //Student will be calling this method to know the session details
    @Override
    public String getUpdate(IObserverStudent student) {
        //check if the student is registered
        if(registeredStudents.contains(student))
        {
            return this.studyTopic;
        }
        return null;
    }

    //Method to update the topics of discussion for every session
    public void addStudyTopic(String studyTopic)
    {
        System.out.println("Added the study topic : " + studyTopic);
        this.studyTopic = studyTopic;

        //Notify all the registered students
        notifyStudents();
    }
}
