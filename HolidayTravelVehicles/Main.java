public class Main {
    public static void main(String[] args) {
        // Creating a new Vehicle object
        Vehicle myCar = new Vehicle("V291002", "Sedan", "BMW", "X5", 2021, 35000);

        // Displaying vehicle details
        System.out.println("Vehicle Details:");
        System.out.println("Serial Number: " + myCar.getVehicleSerialNumber());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Manufacturer: " + myCar.getManufacturer());
        System.out.println("Name: " + myCar.getName());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Base Cost: $" + myCar.getBaseCost());

        // Creating a new vehicle record
        myCar.createNewVehicleRecord();
    }
}