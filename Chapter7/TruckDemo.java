class Vehicle2 {
    private int passengers; // Number of passengers
    private int fuelCap; // Fuel capacity
    private int mpg; // Fuel consumption

    Vehicle2 (int passengers, int fuelCap, int mpg) {
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.mpg = mpg;
    }

    // Return the range
    int range() {
        return fuelCap * mpg;
    }

    // Compute fuel needed for a given distance
    double fuelNeeded (int miles) {
        return (double) miles / mpg;
    }

    // Accessor methods for instance variables
    int getPassengers() { return passengers;}
    void setPassengers(int p) {passengers = p;}
    int getFuelCap() { return fuelCap; }
    void setFuelCap(int f) { fuelCap = f; }
    int getMpg() { return mpg; }
    void setMpg(int m) { mpg = m; }
}

class Truck extends Vehicle2 {
    private int cargoCap; // Cargo capacity in kg

    Truck(int passenger, int fuelCap, int mpg, int cargoCap) {
        // Initialize Vehicle members using Vehicles constructor
        super(passenger, fuelCap, mpg);
        this.cargoCap = cargoCap;
    }

    // Accessor methods for cargoCap
    int getCargo() { return cargoCap; }
    void putCargo(int cargoCap) { this.cargoCap = cargoCap;}
}

public class TruckDemo {
    public static void main(String args[]) {
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelNeeded(dist);
        System.out.println("Semi can carry " + semi.getCargo() + " pounds.");
        System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of fuel.\n");

        gallons = pickup.fuelNeeded(dist);
        System.out.println("Pickup can carry " + pickup.getCargo() + " pounds.");
        System.out.println("To go " + dist + " miles pickup needs " + gallons + " gallons of fuel.");
    }
}
