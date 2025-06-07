package procedure03.problem04.entity;

public class EnergyManager {
    public static void remaining_energy(EnergySource solar, EnergySource wind, EnergySource geo) {
        double total = 0.0;
        total = solar.energyAmount + wind.energyAmount + geo.energyAmount;
        System.out.printf("남아있는 에너지량 : %f", total);
    }
}
