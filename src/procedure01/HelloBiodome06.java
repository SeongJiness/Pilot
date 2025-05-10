package procedure01;

public class HelloBiodome06 {
    public static void main(String[] args) {
        String code1 = args[0];
        String code2 = args[1];

        if(args.length != 2) {
            System.out.println("두 개의 입력값이 들어오지 않았습니다.");
        }

        if((args[0].length() < 5 || args[0].length() > 20) || (args[1].length() < 5 || args[1].length() > 20)) {
            System.out.println("유전자 정보는 최소 5개 이상이어야 하며 최대 20개여야 합니다.");
            System.exit(0);
        }

        if(code1.length() != code2.length()) {
            System.out.println("-> 일치하지 않습니다.");
            System.exit(0);
        } else {
            int count = 0;
            while(count < code1.length()) {
                if(code1.charAt(count) == code2.charAt(count)) {
                    count++;
                } else {
                    System.out.println("-> 일치하지 않습니다.");
                    return;
                }
            }
            System.out.println("-> 동일한 유전자 코드입니다.");
        }
    }
}
