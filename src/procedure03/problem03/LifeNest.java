package procedure03.problem03;


import java.util.ArrayList;

public class LifeNest {
    ArrayList<Organism> organismList = new ArrayList<>(); //Organism 객체를 저장하는 organismList 리스트 필드

    public void addOrganism(Organism information) { //추가 메서드
        organismList.add(information);
        System.out.println("[LifeNest] "+ information.getName() + "추가되었습니다.");
    }

    public void removeOrganism(Organism information) { //삭제 메서드
        for (int i = 0; i < organismList.size(); i++) {
            if (organismList.get(i).getName().equals(information.getName())) {
                organismList.remove(i);
                System.out.println("[LifeNest] " + information.getName() + " 삭제되었습니다.");
                break;
            }
        }
    }

    public void displayAll() { //전체 동식물 목록 출력
        System.out.println("전체 동식물 목록 출력:");
        int count = 1;
        for (Organism o : organismList) {
            System.out.println(count + ". " + o.displayInfo());
            count++;
        }
    }
}
