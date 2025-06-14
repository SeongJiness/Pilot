package procedure01;

public class HelloBiodome09 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);


        while(true) {
            if(num < 3 || num > 100) {
                System.out.println("잘못된 입력입니다. 3~100 사이의 숫자를 입력하세요");
            }

            for(; num > 0; num--) {
                System.out.println("*");
            }
        }

    }
}
