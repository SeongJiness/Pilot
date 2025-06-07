package procedure03.problem04;


import procedure03.problem04.entity.EnergyManager;
import procedure03.problem04.entity.GeothermalEnergy;
import procedure03.problem04.entity.SolarEnergy;
import procedure03.problem04.entity.WindEnergy;

public class BiodomeFamily04 {
    public static void main(String[] args) {
        SolarEnergy solar = new SolarEnergy();
        WindEnergy wind = new WindEnergy();
        GeothermalEnergy geo = new GeothermalEnergy();

        EnergyManager manager = new EnergyManager();


        solar.produceEnergy(5);
        wind.produceEnergy(12);
        geo.produceEnergy(4);

        solar.useEnergy(30);
        wind.useEnergy(30);
        geo.useEnergy(30);


        manager.remaining_energy(solar, wind, geo);

    }
}
