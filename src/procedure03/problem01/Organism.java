package procedure03.problem01;

public class Organism {
    private String name; //이름
    private String bell; //종
    private String habitat; //서식지

    public Organism(String name, String bell, String habitat) { //이름, 종, 주요 서식지를 입력받아 초기화하는 생성자
        this.name = name;
        this.bell = bell;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public String getBell() {
        return bell;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBell(String bell) {
        this.bell = bell;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String displayInfo() { //동식물의 정보를 출력하는 displayInfo 메서드
        return name + ", " + bell + ", " + habitat;
    }

}