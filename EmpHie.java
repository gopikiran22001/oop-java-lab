
class Employee {
    private String name,designation;
    private int age;

    public Employee(String name, String designation, int age) {
        this.name = name;
        this.designation = designation;
        this.age = age;
    }

    public Employee() {
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void display() {
        System.out.println("Employee [ Name:"+name+", Age:"+age+", Designation:"+designation+" ]");
    }
}

class Manager extends Employee{
    private String department;

    public Manager(String name, String designation, int age, String department) {
        super(name, designation, age);
        this.department = department;
    }

    public Manager(String department) {
        this.department = department;
    }

    public Manager() {
    }
    public void display() {
        System.out.println("Manager [ Name:"+getName()+", Age:"+getAge()+", Designation:"+getDesignation()+", Department:"+department+" ]");
    }
}

class Developer extends Employee {
    private String proLang;

    public Developer(String name, String designation, int age, String proLang) {
        super(name, designation, age);
        this.proLang = proLang;
    }

    public Developer() {
    }

    public String getProLang() {
        return proLang;
    }

    public void setProLang(String proLang) {
        this.proLang = proLang;
    }
    public void display() {
        System.out.println("Developer [ Name:"+getName()+", Age:"+getAge()+", Designation:"+getDesignation()+", Programing Language:"+proLang+" ]");
    }
}

public class EmpHie {
    public static void main(String[] args) {
        Employee employee=new Employee("Gopi","Programer",19);
        Manager manager=new Manager("Prem","Manager",21,"Testing");
        Developer developer=new Developer("Manikanta","Developer",20,"Kotlin");

        employee.display();

        manager.display();

        developer.display();
    }
}
