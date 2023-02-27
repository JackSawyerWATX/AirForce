class BomberTest {

    private static String aircraftModel = "North American B-25";
    private static int fuelUp = 1000;
    private static int fly = 1300;
    private static int carryOrdinance = 3000;
    public static int displayFuel;
    private static int fuelLevel = (fuelUp - 615);
    // public static int display = displayFuel - fuelLevel;

    public static void main(String[] args) {

        String mission = Bomber.bomberMission(aircraftModel, carryOrdinance, fuelUp, fly);

        System.out.println(mission);
        
        int displayFuel = (fuelLevel);

        System.out.println("Total fuel consumption: " + displayFuel + " US Gallons.");

        int ordinanceDropped = (carryOrdinance);

        System.out.println("Total ordinance dropped: " + (ordinanceDropped - 1500) + " lbs.");

        int distanceFlown = (fly);

        System.out.println("Total distance flown: " + (distanceFlown - 975) + " Nautical miles.");
    }
}
