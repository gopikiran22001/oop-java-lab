import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

class InvalidCustomerException extends Exception {
    public InvalidCustomerException(String message) {
        super(message);
    }
}
class Customer {
    private String customerId,name,email,phoneNumber;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) throws InvalidCustomerException {
        if (customerId == null || customerId.equals("")) {
            throw new InvalidCustomerException("Enter customerId Correctly");
        }
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidCustomerException {
        if (name == null || name.equals("")) {
            throw new InvalidCustomerException("Enter Name Correctly");
        }
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws InvalidCustomerException {
        if (email == null || email.equals("")) {
            throw new InvalidCustomerException("Enter email Correctly");
        }
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws InvalidCustomerException {
        if (phoneNumber == null || phoneNumber.equals("")) {
            throw new InvalidCustomerException("Enter phoneNumber Correctly");
        }
        this.phoneNumber = phoneNumber;
    }
    public String display() {
        return "Customer [ Customer ID:"+customerId+", Customer Name:"+name+", Customer Phone:"+phoneNumber+", Customer email:"+email+" ]";
    }
}
class Manage {
    private HashMap<String,Customer> customerList=new HashMap<>();
    public String registerCustomer(String name, String email, String phoneNumber) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        Customer customer = new Customer();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }
        try {
            customer.setName(name);
            customer.setPhoneNumber(phoneNumber);
            customer.setEmail(email);
            customer.setCustomerId(result.toString());
        } catch (InvalidCustomerException e) {
            System.out.println(e.getMessage());
            return null;
        }
        customerList.put(result.toString(),customer);
        return result.toString();
    }
    public String getCustomerDetails(String customerId) {
        if(customerList.containsKey(customerId))
            return customerList.get(customerId).display();
        return "Record Not Exist";
    }
}

public class Scratch {
    public static void main(String[] args) {
        Manage manage=new Manage();
        String t=manage.registerCustomer("hjbnkj","vvjbjhbj","6555");
        System.out.println(manage.getCustomerDetails(t));
    }
}
