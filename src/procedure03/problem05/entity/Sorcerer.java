package procedure03.problem05.entity;

import procedure03.problem05.interfaces.EnergyGenerator;

import java.util.ArrayList;
import java.util.List;

public class Sorcerer {
    private String name;
    private List<AncientArtifact> artifacts; // 마법사가 소유한 유물 목록

    public Sorcerer(String name) {
        this.name = name;
        this.artifacts = new ArrayList<AncientArtifact>();
        System.out.printf("마법사 '%s'이 생성되었습니다.\n", name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addArtifact(AncientArtifact artifact) {
        artifacts.add(artifact);
        System.out.println("마법사 '" + name + "'이 " + artifact.getName() + "을 소유하게 되었습니다.");
    }

    //마법사가 유물의 능력을 확인함
    public void ability(AncientArtifact artifact) {
        System.out.printf("마법사 \'%s\'이 %s의 능력을 확인합니다.\n",name,artifact.getName());
        System.out.println();
        artifact.describe(); // 유물의 능력 설명 호출

    }

    //마법사가 유물의 에너지 생성 능력을 사용함
    public void use(AncientArtifact artifact) {
        System.out.printf("마법사 \'%s\'이 %s의 에너지 생성 능력을 사용합니다.\n",name,artifact.getName());

        // 유물이 에너지 생성 인터페이스를 구현하고 있는 경우
        if (artifact instanceof EnergyGenerator) {
            ((EnergyGenerator) artifact).generateEnergy(); //형변환
        } else {
            System.out.println("에너지 생성 능력이 없습니다.");
        }
    }
}
