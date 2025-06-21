package procedure06.problem01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RunBiodome01 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("멤버 리스트를 입력하세요:");

        String input = stdIn.nextLine();

        input = input.replace("[","").replace("]","").trim();

        String[] members = input.split(",");

        ArrayList<String> memberList = new ArrayList<>();

        for(String member : members) {
            memberList.add(member.trim()); // , 기준으로 나누었을 때 공백 제거
        }

        List<String> welcomeMessages = memberList.stream()
                .filter(name -> name.startsWith("신입-"))
                .map(name -> name.replace("신입-", "") + "님 환영합니다")
                .collect(Collectors.toList());

        System.out.println(welcomeMessages);
    }
}
