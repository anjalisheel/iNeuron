public class Program {
    public static void main(String[] args) {
        //Create a batch
        Batch batch = new Batch();

        //Create students
        IObserverStudent student1 = new BatchSubscriber("StudentName1");
        IObserverStudent student2 = new BatchSubscriber("StudentName2");
        IObserverStudent student3 = new BatchSubscriber("StudentName3");
        IObserverStudent student4 = new BatchSubscriber("StudentName4");
        IObserverStudent student5 = new BatchSubscriber("StudentName5");

        //Registering students to the course
        batch.register(student1);
        batch.register(student2);
        batch.register(student3);
        batch.register(student4);

        //Attaching the teacher to each student
        student1.setClass(batch);
        student2.setClass(batch);
        student3.setClass(batch);
        student4.setClass(batch);

        //Add study topic for the class
        batch.addStudyTopic("Observer pattern");
    }
}