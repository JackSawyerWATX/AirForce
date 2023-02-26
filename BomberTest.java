class BomberTest {

    private static String aircraftModel = "North American B-25";
    private static String fuelUp = "1000";
    private static String fly = "1300";
    private static String carryOrdinance = "3000";

    public static void main(String[] args) {

        String mission = Bomber.bomberMission(aircraftModel, carryOrdinance, fuelUp, fly);

        System.out.println(mission);
    }
}
