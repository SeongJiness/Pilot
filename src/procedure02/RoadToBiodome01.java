package procedure02;

public class RoadToBiodome01 {
    public static void main(String[] args) {
        int[] padong = new int[args.length];
        int[] compare = new int[args.length]; //중복되지 않은 값만 담는 배열
        int compareIndex = 0; // 실제 compare 배열에 쓴 위치를 추적


        for (int i = 0; i < args.length; i++) {
            try {
                int input = Integer.parseInt(args[i]);
                if(input < 0 || input > 1000) {
                    System.out.println("입력된 값의 범위가 올바르지 않습니다. 0에서 1000까지의 값을 입력해주세요.");
                    System.exit(0);
                }
                padong[i] = input;
            } catch (NumberFormatException e) {
                System.out.println("정수로 변환할 수 없는 값이 있습니다: " + args[i]);
                return;
            }
        }


        for (int i = 0; i < padong.length; i++) { //이중 루프로 배열의 요소를 하나를 꺼내고 다른 요소 전체 비교
            int count = 0;
            for (int j = 0; j < padong.length; j++) {
                if (padong[i] == padong[j]) {
                    count++;
                }
            }
            if (count == 1) { //중복된 값이 없으면 compare 배열에 넣는다.
                compare[compareIndex++] = padong[i];
            }
        }

        for (int i = 0; i < compareIndex; i++) {
            System.out.println(compare[i]);  // → 실제 저장된 값만 출력
        }

    }
}
