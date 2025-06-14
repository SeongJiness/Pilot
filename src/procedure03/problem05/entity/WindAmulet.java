package procedure03.problem05.entity;

import procedure03.problem05.interfaces.WeatherController;

public class WindAmulet extends AncientArtifact implements WeatherController {

    public WindAmulet() {
        super("바람의 부적");
        System.out.println("바람의 부적 유물이 생성되었습니다.");
    }

    @Override
    public void describe() {
        System.out.println("\"바람의 부적으로 날씨 조절중! 주변 공기의 흐름을 이용해 날씨를 조절합니다.\"");
    }

    @Override
    public void controlWeather() {
        System.out.println("\"바람의 부적으로 주변 공기의 흐름을 이용해 날씨를 조절합니다!\"");
    }


}
