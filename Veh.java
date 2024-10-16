class Engine {
    private String stroke,fuelType,name;

    public String getName() {
        return name;
    }

    public Engine(String stroke, String fuelType, String name) {
        this.stroke = stroke;
        this.fuelType = fuelType;
        this.name = name;
    }

    public String getStroke() {
        return stroke;
    }

    public String getFuelType() {
        return fuelType;
    }
}
class Vehicle {
    private String name;
    private int maxSpeed;

    public Vehicle(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public String toString() {
        return "Vehicle [Name: "+name+", Max Speed: "+maxSpeed+" ]";
    }
}
class Car extends Vehicle {
    private String regNumber;
    private String model;

    public String getCc() {
        return cc;
    }

    private String cc;
    private Engine engine;
    private int capacity;

    public String getRegNumber() {
        return regNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Car(String name, int maxSpeed, String regNumber, String model, String cc, Engine engine, int capacity) {
        super(name, maxSpeed);
        this.regNumber = regNumber;
        this.model = model;
        this.cc = cc;
        this.engine = engine;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Car [Name: "+getName()+", Model: "+model+", Registration Number: "+regNumber+", Max Speed: "+getMaxSpeed()+" km/h, Capacity: "+capacity+", Engine Name: "+engine.getName()+", Stokes: "+engine.getStroke()+", FuelType: "+engine.getFuelType()+" ]";
    }
}

class Bicycle extends Vehicle {
    private boolean hasBell,gear;

    public boolean isHasBell() {
        return hasBell;
    }

    public boolean isGear() {
        return gear;
    }

    public Bicycle(String name, int maxSpeed, boolean hasBell, boolean gear) {
        super(name, maxSpeed);
        this.hasBell = hasBell;
        this.gear = gear;
    }
    @Override
    public String toString() {
        return "Bicycle [Name: "+getName()+", Gear: "+gear+", HasBell: "+hasBell+", Max Speed: "+getMaxSpeed()+" km/h ]";
    }
}

class Bike extends Vehicle {
    private String model,regNumber,cc;
    private Engine engine;

    public Bike(String name, int maxSpeed, String model, Engine engine, String cc, String regNumber) {
        super(name, maxSpeed);
        this.model = model;
        this.engine = engine;
        this.cc = cc;
        this.regNumber = regNumber;
    }

    public String getModel() {
        return model;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getCc() {
        return cc;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Bike [Name: "+getName()+", Model: "+model+", Registration Number: "+regNumber+", Max Speed: "+getMaxSpeed()+" km/h, Engine Name: "+engine.getName()+", Stokes: "+engine.getStroke()+", CC: "+cc+", FuelType: "+engine.getFuelType()+" ]";
    }
}
class Bus extends Vehicle {
    private String regNumber,model;
    private Engine engine;
    private int capacity;

    public Bus(String name, int maxSpeed, String regNumber, String model, Engine engine, int capacity) {
        super(name, maxSpeed);
        this.regNumber = regNumber;
        this.model = model;
        this.engine = engine;
        this.capacity = capacity;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getCapacity() {
        return capacity;
    }
    public String toString() {
        return "Bus [Name: "+getName()+", Model: "+model+", Registration Number: "+regNumber+", Max Speed: "+getMaxSpeed()+" km/h, Capacity: "+capacity+", Engine Name: "+engine.getName()+", Stokes: "+engine.getStroke()+", FuelType: "+engine.getFuelType()+" ]";
    }
}
class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle("Train",189);
        Car car=new Car("BMW",256,"AP31ZE1456","750i","500 CC",new Engine("8","Petrol","V9"),4);
        Bicycle bicycle=new Bicycle("Hero",40,true,false);
        Bike bike=new Bike("Pulser",125,"NS 200",new Engine("1","Petrol","Bajaj"),"200 CC","AP31SK0088");
        Bus bus=new Bus("Garuda",120,"AP25ZO7856","BS5",new Engine("8","Diesel","TATA"),60);
        System.out.println(vehicle);
        System.out.println(car);
        System.out.println(bicycle);
        System.out.println(bike);
        System.out.println(bus);
    }
}
