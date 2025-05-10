package procedure01;

public class HelloBiodome02 {
    public static void main(String[] args) {
        int solar = Integer.parseInt(args[0]);
        int wind= Integer.parseInt(args[1]);
        int geo = Integer.parseInt(args[2]);

        int sum = solar + wind + geo;

        double solarPer = (double) solar / sum * 100;
        double windPer = (double) wind / sum * 100;
        double geoPer = (double) geo / sum * 100;

        System.out.println("총 에너지 사용량은 " + sum + "입니다.");
        System.out.printf("태양광 %.9f%%, 풍력 %.9f%%, 지열 %.9f%%\n", solarPer, windPer, geoPer);
    }
}

