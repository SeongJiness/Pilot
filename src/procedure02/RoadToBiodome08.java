package procedure02;

public class RoadToBiodome08 {
    static int front = 0;
    static int rear = 0;

    public static void main(String[] args) {
        int[] input = new int[args.length]; // 사용자로 부터 받은 입력은 정수배열로 변환
        int[] queue = new int[100]; // 큐 배열

        enterValue(input, args); //정수배열에 값넣기

        for(int i = 0; i < input.length; i++) { //사용자가 입력한 갯수만큼 큐에 값을 넣는다.(enqueue)
            enqueue(input , queue);
        }
        int value = dequeue(input, queue); //먼저 들어간 데이터의 값을 하나 빼오기 (dequeue)
        System.out.println("dequeue : " + value);

        int peek = peek(input, queue);
        System.out.println("peek : " + peek); //현재 데이터의 값 가져오기

        System.out.println("모든 요청이 처리되었습니다.");



        
    }

    static boolean isFull(int[] queue) { //큐가 가득찼는지 확인하는 함수
       return rear == queue.length;
    }

    static boolean isEmpty(int[] queue) { //큐가 비어있는지 확인하는 함수
        return front == rear;
    }

    static void enterValue(int[] input, String[] args) {
        for(int i = 0; i < args.length; i++) { // 정수배열에 값 넣기
            input[i] = Integer.parseInt(args[i]);
        }
    }

    static void enqueue(int[] input, int[] queue) { //큐에 값을 넣기
        if(isFull(queue)) { //큐에 값을 넣기 전에 큐가 가득 차 있는지 확인
            System.out.println("큐의 값이 가득찼습니다.");
            return;
        }
        queue[rear] = input[rear];
        System.out.println("자원 " + queue[rear]+"을 제공했습니다.");
        ++rear;
    }

    static int dequeue(int[] input, int[] queue) { //큐에서 값을 빼기
        if(isEmpty(queue)) { //큐에서 값을 빼기 전에 비어있는지 확인
            System.out.println("큐의 값이 비어있습니다.");
            return -1;
        }
        int value = queue[front];
        ++front;
        return value;
    }

    static int peek(int[] input, int[] queue) { //큐가 현재 가리키는 값을 가져오는 함수
        if(isEmpty(queue)) {
            System.out.println("큐의 값이 비어있습니다.");
            return -1;
        }
        int value = queue[front];
        return value;
    }
}

