package procedure01;

public class HelloBiodome03 {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서 대로 숫자 값을 입력해주세요");
            return;
        }

        double temp = 0.0;
        double hum = 0.0;
        double ox = 0.0;

        try {
            temp = Double.parseDouble(args[0]);
            hum = Double.parseDouble(args[1]);
            ox = Double.parseDouble(args[2]);
        } catch (Exception e) {
            System.out.println("입력한 값이 숫자가 아닙니다.");
            System.exit(0);
        }

        final double PI = 3.14;

        double sqrtHum = computeSquareRoot(hum);

        double absts = abs(temp, sqrtHum);

        double health = tree(absts, PI, ox);

        System.out.println("-> 생명지수 H = " + health);



    }

    static public double computeSquareRoot(double num) {
        double xn = 1.0;
        for (int i = 0; i < 1000; i++) {
            xn = (xn + num / xn) / 2;
        }

        return xn;
    }

    public static double abs(double temp, double sqrthum) {
        double value = sqrthum - temp;
        if (value < 0) {
            return -value;
        } else {
            return value;
        }
    }

    public static double tree(double absts, double PI, double ox) {
        double result = absts + (ox / (PI*PI));
        return result;
    }
}
