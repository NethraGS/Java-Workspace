package Core;

class Car {
    String model;

    public int getChassisno() {
        return chassisno;
    }

    public void setChassisno(int chassisno) {
        this.chassisno = chassisno;
    }

    private int chassisno;
    double price;
    String color;

    public Car(){

    }
    public Car(String color){
        this.color=color;
    }

    void displayDetails() {
        System.out.println("Basic.Car Color: " + color);
        System.out.println("Basic.Car Price: ₹" + price);
    }

    public static void main(String[] args) {
        Car c=new Car("red");
        c.displayDetails();
    }
}
