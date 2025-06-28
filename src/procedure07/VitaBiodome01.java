package procedure07;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class VitaBiodome01 {
    public static void main(String[] args) {
        // try-with-resources로 Scanner 안전하게 사용
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("URL 주소를 입력하세요: ");
            String input = stdIn.nextLine();
            String cleanedUrl = input.replaceAll("\\s+", ""); // 공백 제거

            try {
                URL url = new URL(cleanedUrl);

                // URL 클래스의 메서드 출력
                System.out.println("url.getAuthority(): " + url.getAuthority());

                try {
                    System.out.println("url.getContent(): " + url.getContent());
                } catch (IOException e) {
                    System.out.println("IOException 발생: " + e.getMessage());
                }

                System.out.println("url.getDefaultPort(): " + url.getDefaultPort());
                System.out.println("url.getPort(): " + url.getPort());
                System.out.println("url.getFile(): " + url.getFile());
                System.out.println("url.getHost(): " + url.getHost());
                System.out.println("url.getPath(): " + url.getPath());
                System.out.println("url.getProtocol(): " + url.getProtocol());
                System.out.println("url.getQuery(): " + url.getQuery());
                System.out.println("url.getRef(): " + url.getRef());
                System.out.println("url.getUserInfo(): " + url.getUserInfo());
                System.out.println("url.toExternalForm(): " + url.toExternalForm());

                try {
                    System.out.println("url.toURI(): " + url.toURI());
                } catch (URISyntaxException e) {
                    System.out.println("URISyntaxException 발생: " + e.getMessage());
                }

            } catch (MalformedURLException e) {
                System.out.println("잘못된 URL입니다: " + e.getMessage());
            }

        }
    }
}
