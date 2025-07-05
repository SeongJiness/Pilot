package procedure02;

public class RoadToBiodome05 {
    public static void main(String[] args) {
        if (args.length != 2) { // 두 개의 물 높이 배열을 입력하지 않았을 때
            System.out.println("두 개의 물 높이 배열을 입력하세요.");
            return;
        }

        int[] arr1, arr2;

        try {
            arr1 = parseInput(args[0]);
            arr2 = parseInput(args[1]);
        } catch (IllegalArgumentException e) {
            System.out.println("입력 오류: " + e.getMessage());
            return;
        }

        // 두 배열 합치기
        int[] merged = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);

        // 퀵 정렬
        quickSort(merged, 0, merged.length - 1);

        // 출력
        System.out.print("→ [");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i]);
            if (i != merged.length - 1) System.out.print(",");
        }
        System.out.println("]");
    }

    public static int[] parseInput(String input) {
        input = input.replace("[", "").replace("]", ""); // ← 이 부분 추가

        String[] tokens = input.split(",");
        int[] result = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i].trim();
            int value;

            try {
                value = Integer.parseInt(token);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("숫자가 아닌 값이 포함되어 있습니다: \"" + token + "\"");
            }

            if (value < 0) {
                throw new IllegalArgumentException("물 높이는 음수가 될 수 없습니다: " + value);
            }

            result[i] = value;
        }

        return result;
    }
    // 퀵 정렬 구현
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIdx = partition(arr, low, high);
            quickSort(arr, low, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // 마지막 요소를 피벗으로 선택
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high); // 피벗을 올바른 위치로
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
