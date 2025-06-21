package procedure06.problem02;

import java.util.HashMap;
import java.util.Map;

public class EnergyDistributor {
    private int totalEngery = 50000;
    HashMap<String, Integer> energy;

    public EnergyDistributor() {
        energy = new HashMap<>(); // 여기서 초기화
    }
    
    //함수형 인터페이스
    @FunctionalInterface
    public interface EnergyAssignment {
        void assign(String name, int amount);
    }

    public void checkEnergy() {
        System.out.printf("전체 남은 에너지: %d\n" , totalEngery);
    }

    public int getTotalEngery() {
        return totalEngery;
    }

    public void setTotalEngery(int totalEngery) {
        this.totalEngery = totalEngery;
    }

    public void showEnergyByZone() { //키와 값을 가져와서 출력하는 메서드
        System.out.println("구역별 에너지 조회");
        for (Map.Entry<String, Integer> entry : energy.entrySet()) {
            System.out.printf("%s - %d\n", entry.getKey(), entry.getValue());
        }
    }

    public void assignEnergyToZone(String name, int amount) {
        int current = energy.getOrDefault(name, 0); //키가 존재하면 값을 가져오기
        energy.put(name, current + amount);
        totalEngery -= amount;

        System.out.printf("%s에 %d의 에너지가 할당되었습니다. 남은 전체 에너지: %d\n", name, amount, totalEngery);
    }


}
