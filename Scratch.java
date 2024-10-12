import java.util.HashMap;
import java.util.Random;

class InvalidCustomerException extends Exception {
    public InvalidCustomerException(String message) {
        super(message);
    }
}
class Customer {
    protected String customerId,name,email,phoneNumber;

    public Customer() {
    }

    public Customer(String customerId, String name, String email, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String toString() {
        return "Customer [ Customer ID:"+customerId+", Customer Name:"+name+", Customer Phone:"+phoneNumber+", Customer email:"+email+" ]";
    }
}
class NotFoundCustomer extends Customer {
    private static NotFoundCustomer notFoundCustomer;

    private NotFoundCustomer() {
    }

    public static NotFoundCustomer getNotFoundCustomer() {
        if (notFoundCustomer == null)
            notFoundCustomer = new NotFoundCustomer();
        return notFoundCustomer;
    }

    @Override
    public String toString() {
        return "Can't Find the Customer";
    }
}
class Manage {
    private HashMap<String,Customer> customerList=new HashMap<>();
    public String registerCustomer(String name, String email, String phoneNumber) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }
        try {
            if(name == null || name.equals(""))
                throw new InvalidCustomerException("Invalid Name");
            else if (email == null || email.equals(""))
                throw new InvalidCustomerException("Invalid eMail");
            else if (phoneNumber == null || phoneNumber.equals(""))
                throw new InvalidCustomerException("Invalid Phone Number");
            else {
                customerList.put(result.toString(),new Customer(result.toString(),name,email,phoneNumber));
                return result.toString();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public Customer getCustomerDetails(String customerId) {
        if(customerList.containsKey(customerId))
            return customerList.get(customerId);
        return NotFoundCustomer.getNotFoundCustomer();
    }
}

public class Scratch {
    public static void main(String[] args) {
        Manage manage=new Manage();
        String t=manage.registerCustomer("gopi","@1234","55452545");
        System.out.println(manage.getCustomerDetails(t));
    }
}
