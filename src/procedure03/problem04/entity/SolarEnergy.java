package procedure03.problem04.entity;

public class SolarEnergy extends EnergySource {

    public SolarEnergy() {
        super.setSourceName("태양광");
    }


    @Override
    public void produceEnergy(int time) {
        energyAmount += time * 10;
        System.out.println(super.getSourceName() + " " + energyAmount + " 생산했습니다.");
    }
}
