package procedure06.problem02;

import java.util.Scanner;

public class RunBiodome02 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        EnergyDistributor dist = new EnergyDistributor();

        int choice = 0;

        EnergyDistributor.EnergyAssignment lambdaAssign = (name, amount) -> {
            dist.assignEnergyToZone(name, amount);
        }; // EnergyAssignment 인터페이스의 assign() 메서드에 대한 람다 표현식


        while(true) {
            System.out.println("바이오도메 에너지 관리 시스템에 오신 것을 환영합니다.");
            System.out.println("1. 전체 에너지 조회하기");
            System.out.println("2. 특정 구역 에너지 할당하기");
            System.out.println("3. 구역별 에너지 조회하기");
            System.out.println("4. 종료하기");

            System.out.println();

            System.out.print("메뉴를 선택하세요: ");

            choice = stdIn.nextInt();

            switch(choice) {
                case 1 :
                    dist.checkEnergy();
                    break;
                case 2 :
                    System.out.print("할당하려는 구역 이름을 입력하세요: ");
                    String name = stdIn.next();
                    System.out.print("할당하려는 에너지량을 입력하세요: ");
                    int amount = stdIn.nextInt();
                    lambdaAssign.assign(name, amount);
                    break;
                case 3 :
                    System.out.println("구역별 에너지 조회");
                    dist.showEnergyByZone();
                    break;
                case 4 :
                    System.out.println("바이오도메 에너지 관리 시스템을 종료합니다. 감사합니다.");
                    System.exit(0);
                default:
                    System.out.println("1번에서 4번 메뉴를 선택해주세요.");
            }
        }
    }
}
