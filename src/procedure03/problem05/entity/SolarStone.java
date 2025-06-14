package procedure03.problem05.entity;

import procedure03.problem05.interfaces.EnergyGenerator;

public class SolarStone extends AncientArtifact implements EnergyGenerator {

    public SolarStone() {
        super("태양의 돌");
        System.out.println("태양의 돌 유물이 생성되었습니다.");
    }

    @Override
    public void describe() {
        System.out.println("\"태양의 돌로 에너지 생성 중! 빛을 받은 시간에 따라 에너지의 양이 달라집니다.\"");
    }

    @Override
    public void generateEnergy() {
        System.out.println("\"태양의 돌이 빛을 받아 에너지를 생성했습니다!\"");
    }
}
