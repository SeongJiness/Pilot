package procedure01;

public class HelloBiodome04 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("숫자값 3개가 모두 입력되지 않은 경우");
            return;
        }

        double temp, hum, ox;

        try {
            temp = Double.parseDouble(args[0]);
            hum = Double.parseDouble(args[1]);
            ox = Double.parseDouble(args[2]);
        } catch (Exception e) {
            System.out.println("-> 입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서대로 숫자 값을 입력해주세요");
            return;
        }

        boolean flag = confirm(temp, hum, ox);

        if (flag) {
            System.out.println("-> 생명의 나무는 안정적인 상태입니다 :)");
        }
    }

    public static boolean confirm(double temp, double hum, double ox) {
        if (temp < 10 || temp >= 27.5) {
            System.out.println("온도값이 정상 범위를 벗어났습니다. 확인이 필요합니다.");
            return false;
        }
        if (hum <= 40 || hum >= 60) {
            System.out.println("습도값이 정상 범위를 벗어났습니다. 확인이 필요합니다.");
            return false;
        }
        if (ox <= 19.5 || ox > 23.5) {
            System.out.println("산소 농도값이 정상 범위를 벗어났습니다. 확인이 필요합니다.");
            return false;
        }
        return true;
    }
}
