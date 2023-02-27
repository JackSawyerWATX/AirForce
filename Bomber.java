class Bomber extends Aircraft{

    // Create a separate class Bomber that can carryOrdinance(), fuelUp(), and fly().

    private String AircraftModel;
    private String CarryOrdinance;
    private String FuelUp;
    private String FlyMission;
    private String fuelLevel;

    // carryOrdinance() method should print out a message indicating that the bomber
    // has dropped ordinance, as well as decrease the fuel level by 5.

    public static String bomberMission(String aircraftModel, String carryOrdinance, String fuelUp, String fly) {
        return aircraftModel + " carrying " + carryOrdinance + " lbs. of ordinance, with " + fuelUp + " US Gallons of fuel set to fly " + fly + " Nautical miles.";
    }

    // Overload the constructor method in three different ways.
    public Bomber(String aircraft) {
    }

    public Bomber(String aircraft, String fly) {
    }

    public Bomber(String aircraft, String fuelUp, String fly) {
    }

    public Bomber(String aircraft, String carryOrdinance, String fuelUp, String fly) {
    }

    // Create getter and setters for each field

    public String getAircraft() {
        return AircraftModel;
    }

    public void setAircraft(String aircraftModel) {
        AircraftModel = aircraftModel;
    }

    public String getOrdinance() {
        return CarryOrdinance;
    }

    public void setOrdinance(String carryOrdinance) {
        CarryOrdinance = carryOrdinance;
    }

    public String getFuel() {
        return FuelUp;
    }

    public void setFuel(String fuelUp) {
        FuelUp = fuelUp;
    }

    public String getFly() {
        return FlyMission;
    }

    public void setFly(String flyMission) {
        FlyMission = flyMission;
    }

    public String getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(String FuelLevel) {
        FuelLevel = fuelLevel;
    }
}
