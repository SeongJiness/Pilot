package procedure03.problem04.entity;

public class GeothermalEnergy extends EnergySource {

    public GeothermalEnergy() {
        super.setSourceName("지열");
    }

    @Override
    public void produceEnergy(int temp) {
        energyAmount += temp * 5 + 20;
        System.out.println(super.getSourceName() + " " + energyAmount + " 생산했습니다.");
    }
}
