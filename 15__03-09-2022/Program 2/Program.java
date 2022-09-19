public class Program {
    public static void main(String[] args) {
        MaangGroup maangJob = new MaangGroup();

        ProductBased productBasedJob = new ProductBased();

        ServiceBased serviceBasedJob = new ServiceBased();

        /*
        Maang --> product --> service
        * */

        maangJob.setNextChain(productBasedJob);
        productBasedJob.setNextChain(serviceBasedJob);

        //person with no skills
        System.out.println("For person 1 with no skills");
        Person person1 = new Person("");
        maangJob.getJob(person1);
        System.out.println();

        //person with service as skill type
        System.out.println("For person 2 with service as skill type");
        Person person2 = new Person("Service");
        maangJob.getJob(person2);
        System.out.println();

        //person with product as skill type
        System.out.println("For person 3 with product as skill type");
        Person person3 = new Person("Product");
        maangJob.getJob(person3);
        System.out.println();

        //person with maang as skill type
        System.out.println("For person 4 with maang as skill type");
        Person person4 = new Person("MAANG");
        maangJob.getJob(person4);
    }
}