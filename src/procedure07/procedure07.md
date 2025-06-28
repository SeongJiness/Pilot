# URL 구조
http : //www.naver.com/ <br>
URL의 구조는 다음과 같이 프로토콜식별자(:)과 자원 이름(//www.naver.com/)으로 나누어진다. <br>
자원의 이름은 다시 //www.myhom.net/index.html:8080 다음과 같은 형식으로 구성되는데 <br>
여기서 //www.myhom.net/은 호스트 이름, index.html은 파일 이름, :8080은 포트 번호로 나누어지게 된다.

# 자바의 URL 클래스
URL 클래스의 주요 생성자는 다음과 같다. <br>
```java
URL(String spec);
```
문자열이 spec이 지정하는 자원에 대한 URL 객체 생성
```java
URL(String protocol, String host, int port, String file);
```
프로토콜 식별자 protocol, 호스트 주소 host, 포트번호 port, 파일 이름 file이 지정하는 자원에 대한 URL 객체 생성

# URL 클래스의 주요 메소드
|제목|설명|
|------|---|
|Object getContent()|이 URL의 컨텐츠를 리턴|
|String getFile()|이 URL의 파일 이름 리턴|
|String getHost()|이 URL의 호스트 이름 리턴|
|String getPath()|이 URL의 경로 부분 리턴|
|int getPort()|이 URL의 포트 번호 리턴|
|String getProtocol()|이 URL의 프로토콜 이름 리턴|
|InputStream openStream()|URL 주소와 연결한 뒤 이 연결로부터 입력 받을 수 있는 <br> InputStream 객체 리턴|
|URLConnection openConnection()|URL 주소의 원격 객체에 접속한 뒤 통신할 수 있는 <br> URLConnection 객체 리턴|

url.getContent()는 내부적으로 네트워크 연결을 시도하기 때문에, <br>
실행 도중 네트워크 오류 등이 발생할 수 있어 IOException을 던질 수 있는 메서드입니다. <br>
URL 클래스를 이용하여 연결된 상대편으로부터 데이터를 읽을 때는 그 전에 먼저 openStream() 메소드를 이용하여 입력 스트림을 연다. <br>
그러고 나면 일반적인 입력 스트림에서 읽듯이 데이터를 읽어 온다.

# URL 객체 생성
URL 객체를 생성하는 데에는 두 가지 방법이 있다. 절대경로를 이용하거나, 상대 경로를 이용하여 객체를 생성한다.
```java
package PackageEx;

import java.net.MalformedURLException;
import java.net.URL;

public class WrapperEx {
    public static void main(String[] args) {
        URL opinion = null;
        URL homepage = null;
        try {
            homepage = new URL("http://news.hankooki.com"); // 절대 경로로 생성
            opinion = new URL(homepage, "opinion/deitorial.htm"); // 상대 경로로 생성
        } catch (MalformedURLException e) {
            System.out.println("잘못된 URL입니다.");
        }
        System.out.println("Protocol = " + opinion.getProtocol()); // 프로토콜 출력
        System.out.println("host =" + opinion.getHost()); // 호스트 이름 출력
        System.out.println("port =" + opinion.getPath()); // 포트 번호 출력
        System.out.println("filename =" + opinion.getFile());

    }
}
```
MalformedURLException은 Java에서 잘못된 형식의 URL을 사용할 때 발생하는 예외

# URL 클래스를 이용한 읽기
```java
package PackageEx;

import java.io.*;
import java.net.*;

public class WrapperEx {
    public static void main(String[] args) {
        try {
            URL aURL= new URL("http://www.nate.com");
            BufferedReader in = new BufferedReader(new InputStreamReader(aURL.openStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) //한 행씩 읽기
                System.out.println(inputLine);
            in.close();
        } catch (IOException e) {
            System.out.println("URL에서 데이터를 읽는 중 오류가 발생 했습니다.");
        }
    }
}
```
# URLConnection 클래스를 이용한 데이터 읽기
```java
package PackageEx;

import java.io.*;
import java.net.*;

public class WrapperEx {
    public static void main(String[] args) {
        try {
            URL aURL= new URL("http://www.nate.com");
            URLConnection uc = aURL.openConnection();

            BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));


            String inputLine;

            while ((inputLine = in.readLine()) != null) //한 행씩 읽기
                System.out.println(inputLine);
            in.close();
        } catch (IOException e) {
            System.out.println("URL에서 데이터를 읽는 중 오류가 발생 했습니다.");
        }
    }
}
```
URL과 URLConnection의 가장 큰 차이점은 URL 객체와 달리 HTTP POST방식으로 서버에 데이터를 전송할 수 있다는 것이다.

# URL 클래스를 이용한 쓰기
```java
package PackageEx;

import java.io.*;
import java.net.*;

public class WrapperEx {
    public static void main(String[] args) {
        try {
            URL aURL= new URL("http://httpbin.org/post");

            URLConnection uc = aURL.openConnection();
            uc.setDoOutput(true);
            OutputStreamWriter out = new OutputStreamWriter(uc.getOutputStream());
            out.write("Firstname=Kitae&Lastname=Hwang");
            out.close();
            BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));

            String inputLine;
            while((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();
        } catch(IOException e){
            System.out.println("URL에 데이터를 입출력 중에 오류가 발생했습니다.");
        }
    }
}
```
url.toURI()는 Checked Exception을 던짐 <br>
URL.toURI()는 내부적으로 java.net.URISyntaxException 예외를 던질 수 있습니다. <br>
그 이유는 URL 객체는 형식이 조금 덜 엄격한데, URI는 훨씬 문법에 민감하기 때문입니다.

# try-with-resources란 무엇인가?
try-with-resources는 자바 7에서 도입된 구문으로, 자원을 명시적으로 닫는 코드를 작성하지 않고도 안전하게 자원을 관리할 수 있도록 돕는다. <br>
try-with-resources 구문은 try 블록 안에서 자원을 선언하고, 자동으로 닫히도록 보장해 준다.