package procedure07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class VitaBiodome02 {
    public static void main(String[] args) {
        try (Scanner stdIn = new Scanner(System.in)){
            System.out.print("URL 주소를 입력하세요: ");
            String input = stdIn.nextLine();
            String cleanedUrl = input.replaceAll("\\s+", ""); // 공백 제거
            try {
                URL url = new URL(cleanedUrl);

                try (BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));) {
                    String inputLine;

                    while ((inputLine = in.readLine()) != null) //한 행씩 읽기
                        System.out.println(inputLine);
                }
            } catch (MalformedURLException e) {
                System.out.println("잘못된 URL입니다: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("URL에서 데이터를 읽는 중 오류가 발생 했습니다.");
            }
        }
    }
}
