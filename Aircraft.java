public class Aircraft {

    // Create a Aircraft class that has:
    // fuelLevel() and
    // displayFuel() method.

    // displayFuel() method should show the aircraft's fuel level and return it.

    static String fuelLevel;

    public int fuelLevel(int level) {
        return level;
    }

    public String displayFuel(String display) {
        return "fuel level is at " + display;
    }

    public static String bomberMission(int i) {
        return fuelLevel;
    }
}