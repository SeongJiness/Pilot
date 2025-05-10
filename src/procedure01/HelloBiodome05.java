package procedure01;

public class HelloBiodome05 {
    public static void main(String[] args) {
        confirm();

    }


    public static void confirm() {
        for (int g = 0; g < 16; g++) {
            for (int h = 0; h < 16; h++) {
                boolean cond1 =(((( g & 1) >> g) << 2) | ((h + g) ^ h)) == 1;

                boolean cond2 = ((((g % 2) << h) >> g) | ((1 & 0 ^ 0))) == 2;

                if (cond1 && cond2) {
                    System.out.println((h*h+g)*(h<<h)+(g<<g));
                }
            }
        }
    }
}
