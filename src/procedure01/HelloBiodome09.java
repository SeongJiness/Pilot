package procedure01;

public class HelloBiodome09 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("잘못된 입력입니다. 3~100 사이의 숫자를 입력하세요.");
            return;
        }

        int height = 0;

        try {
            height = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력입니다. 3~100 사이의 숫자를 입력하세요.");
            return;
        }

        if (height < 3 || height > 100) {
            System.out.println("잘못된 입력입니다. 3~100 사이의 숫자를 입력하세요.");
            return;
        }

        int maxWidth = 2 * height - 1;

        // 나무 그리기
        for (int i = 0; i < height; i++) {
            int starCount = 2 * i + 1;
            int spaceCount = (maxWidth - starCount) / 2;
            printChars(' ', spaceCount);
            printChars('*', starCount);
            System.out.println();
        }

        // 기둥 출력
        int trunkSpace = maxWidth / 2;
        printChars(' ', trunkSpace);
        System.out.println("|");
    }

    public static void printChars(char ch, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(ch);
        }

    }
}
