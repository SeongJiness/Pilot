package procedure01;

public class HelloBiodome01 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("이름을 1글자 이상 입력해주세요.");
            return;
        }

        String name = args[0];
        System.out.println(name + " → 반갑습니다, \"" + name + "\"님");
    }
}


