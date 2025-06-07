package procedure03.problem04.entity;

public abstract class EnergySource {
    private String sourceName;
    protected double energyAmount;


    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }


    public void useEnergy(int amount) {
        energyAmount -= amount;
        System.out.printf("%s 에너지를 %d 사용했습니다.\n" , sourceName , amount);
    }

    public abstract void produceEnergy(int use);
}
