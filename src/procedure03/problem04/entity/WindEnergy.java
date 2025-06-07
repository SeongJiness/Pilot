package procedure03.problem04.entity;

public class WindEnergy extends EnergySource {

    public WindEnergy() {
        super.setSourceName("풍력");
    }

    @Override
    public void produceEnergy(int wind_speed) {
        energyAmount += wind_speed * 5;
        System.out.println(super.getSourceName() + " " + energyAmount + " 생산했습니다.");
    }
}
