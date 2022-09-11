public class Program {
    public static void main(String[] args) {
        Subject phone = new Subject("Mobile", "Out of stock");
        Subject tv = new Subject("Television", "Out of stock");

        Observer user1 = new Observer("User 1", phone);
        Observer user2 = new Observer("User 2", phone);
        Observer user3 = new Observer("User 3", phone);
        Observer user4 = new Observer("User 4", phone);
        Observer user5 = new Observer("User 5", phone);
        Observer user6 = new Observer("User 1", tv);
        Observer user7 = new Observer("User 5", tv);

        System.out.println("Phone's current state : " + phone.getAvailability());

        phone.setAvailability("Available");

        System.out.println();

        System.out.println("Tv's current state : " + phone.getAvailability());

        tv.setAvailability("Available");
    }
}