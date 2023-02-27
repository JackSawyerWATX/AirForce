class BomberTest {

    private static String aircraftModel = "North American B-25";
    private static String fuelUp = "1000";
    private static String fly = "1300";
    private static String carryOrdinance = "3000";
    private static int displayFuel;
    private static int fuelLevel;
    // public static int display = displayFuel + fuelLevel;

    public static void main(String[] args) {

        String mission = Bomber.bomberMission(aircraftModel, carryOrdinance, fuelUp, fly);

        System.out.println(mission);
        
        String display = Aircraft.bomberMission(displayFuel + fuelLevel);

        System.out.println(display);
    }
}
