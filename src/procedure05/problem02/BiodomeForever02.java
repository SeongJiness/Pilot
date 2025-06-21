package procedure05.problem02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BiodomeForever02 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("args[] 배열에 아무것도 없습니다.");
            System.exit(1);
        }

        String filename = args[0];

        fileread(filename);
    }

    static void fileread(String filename) {
        FileInputStream input = null;

        try {
            File file = new File("C:\\Users\\LeeSeongJin\\IdeaProjects\\Pilot\\src\\procedure05\\problem02\\" + filename);

            input = new FileInputStream(file);

            int i = 0;
            while((i = input.read()) != -1) {
                System.out.write(i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("존재하지 않는 파일입니다. 파일 이름을 다시 확인해주세요.");
        } catch (IOException e) {
            System.out.println("파일 읽기 중 오류 발생: " + e.getMessage());
        }finally {
            try {
                if (input != null) input.close();
            } catch (IOException e) {
                System.out.println("파일 닫기 중 오류 발생");
            }
        }
    }
}
