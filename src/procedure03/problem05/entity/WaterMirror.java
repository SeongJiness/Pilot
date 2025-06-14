package procedure03.problem05.entity;

import procedure03.problem05.interfaces.EnergyGenerator;
import procedure03.problem05.interfaces.WeatherController;

public class WaterMirror extends AncientArtifact implements WeatherController, EnergyGenerator {

    public WaterMirror() {
        super("물의 거울");
        System.out.println("물의 거울 유물이 생성되었습니다.");
    }

    @Override
    public void describe() {
        System.out.println("\"물의 거울! 수증기를 모아 에너지를 생성하고, 날씨를 조절합니다.\"");
    }

    @Override
    public void controlWeather() {
        System.out.println("\"물의 거울을 이용해 수증기로 에너지를 생성했습니다!\"");
    }

    @Override
    public void generateEnergy() {
        System.out.println("\"물의 거울을 이용해 수증기로 에너지를 생성했습니다!\"");
    }
}
