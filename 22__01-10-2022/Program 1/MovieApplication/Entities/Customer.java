package MovieApplication.Entities;

import java.util.List;

public class Customer extends User {
    public Customer(int id, String name, Address address, int age, List<Long> phoneNumbers) {
        super(id, name, address, age, phoneNumbers);
    }
}
