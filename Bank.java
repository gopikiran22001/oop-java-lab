import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException() {
        super("Insufficient Balance");
    }
}
class InvalidServiceException extends Exception {
    InvalidServiceException() {
        super("Invalid Service");
    }
}
class User {
    private List<List> serviceList=new ArrayList<>();
    private String id,name;
    private double accountBalance;

    public User(String id, double accountBalance, String name) {
        this.id = id;
        this.accountBalance = accountBalance;
        this.name = name;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
    public void makePayment(double amount, String service) {
        accountBalance-=amount;
        List l=new ArrayList();
        l.add(service);
        l.add(amount);
        serviceList.add(l);
    }
    public void serList() {
        for(List service:serviceList) {
            System.out.println(service);
        }
    }
}
class Service {
    private String serviceId,serviceName;
    private double serviceCost;

    public Service(String serviceId, String serviceName, double serviceCost) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceCost = serviceCost;
    }

    public String getServiceId() {
        return serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public Service() {
    }
    public String getServiceDetails() {
        return "Service [ Service ID: " + serviceId + ", Service Name: " + serviceName + ", Service Cost: " + serviceCost+" ]";
    }
}
class PaymentService  {
    private Map<String,Service> serviceMap=new HashMap<>();
    public void processPayment(User user, double amount, String serviceId){
        try {
            if (user.getAccountBalance() < amount)
                throw new InsufficientBalanceException();
            else if (!serviceMap.containsKey(serviceId))
                throw new InvalidServiceException();
            else {
                user.makePayment(amount, serviceMap.get(serviceId).getServiceName());
                System.out.println("Payment Successfull");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void addService(Service service) {
        serviceMap.put(service.getServiceId(),service);
    }
}
public class Bank {
    public static void main(String[] args) {
        User user=new User("00125634",12366654789.0,"Gopi");
        PaymentService paymentService=new PaymentService();
        paymentService.addService(new Service("ABGHT009","Home Loan",5000));
        paymentService.addService(new Service("DFJ776","ATM Charges",200));
        paymentService.addService(new Service("VBUHGB","Gold Loan",10000));
        paymentService.processPayment(user,5000,"DFJ776");
    }
}
