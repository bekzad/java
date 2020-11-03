package Test;

public interface IVehicle {
    // Return the range
    int range();

    // Compute fuel needed for a given distance
    double fuelNeeded (int miles);

    // Accessor methods for instance variables
    int getPassengers();
    void setPassengers(int p);
    int getFuelCap();
    void setFuelCap(int f);
    int getMpg();
    void setMpg(int m);
}

