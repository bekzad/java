
class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;
    
    Vehicle (int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    int range() {
        return fuelcap * mpg;
    }

    double fuelneeded (int miles) {
        return (double) miles / mpg;
    }
}

public class VehicleDemo {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportsCar = new Vehicle(2, 14, 15);

        int dist = 252;

        // minivan.passengers = 18;
        // minivan.fuelcap = 16;
        // minivan.mpg = 21;

        System.out.println("Minivan can carry " + minivan.passengers +
                            " passengers with a range of " + minivan.range());

        System.out.println("To go " + dist + " miles a minivan needs " + 
                            minivan.fuelneeded(dist) + " gallons");


        System.out.println("Sportscar can carry " + sportsCar.passengers +
                            " passengers with a range of " + sportsCar.range());

        System.out.println("To go " + dist + " miles sportscar needs " + 
                            sportsCar.fuelneeded(dist) + " gallons");

    }
}