package procedure02;

import java.util.Stack;

public class RoadToBiodome04 {
    public static void main(String[] args) {
        int minIndex = 0; //최솟값을 가리키는 인덱스 변수
        int[] arr = new int[args.length];
        for(int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        
        //선택정렬 알고리즘
        for(int i = 0; i < arr.length; i++) {
            minIndex = i; //최솟값 초기화
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j; //최솟값 바꾸기
                }
            }
            //값 바꾸기
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }



        double average = average(arr);
        double median = median(arr);

        System.out.println("평균값 : " + average + " 중앙값 : " + median);



    }
    
    //평균 구하는 함수
    static public double average(int[] arr) {
        int sum = 0;
        for(int num : arr) {
            sum+= num;
        }
        return (double)sum / arr.length;
    }
    
    //중앙값 구하는 함수
    static public double median(int[] arr) {
        if (arr.length % 2 == 0) { //배열길이가 짝수 일 때
            int num1 = arr[arr.length / 2];
            int num2 = arr[(arr.length / 2) - 1];
            return (num1 + num2) / 2.0; // 주의: 정수 나눗셈 방지 위해 2.0으로 나눔
        } else { //배열길이가 홀수 일 때
            return arr[arr.length / 2];
        }
    }
}
