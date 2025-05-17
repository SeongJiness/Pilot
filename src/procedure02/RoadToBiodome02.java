package procedure02;

public class RoadToBiodome02 {
    static int top = 0; // 스택 포인터 top

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("입력된 문자열이 없습니다.");
            return;
        }

        String input = args[0];
        String[] s = new String[input.length()];  // 문자열 분리 배열
        String[] stack = new String[input.length()];  // 스택 배열

        if (input.isEmpty()) { // 입력 값이 빈 문자열인 경우
            System.out.println("올바른 문장을 입력해주세요.");
            return;
        } else if (input.length() < 2 || input.length() > 1000000) {
            System.out.println("문자열 길이는 최소 2이상 10의 6승까지입니다.");
            return;
        }

        // 문자열을 한 글자씩 분리해서 배열 s에 저장
        for (int i = 0; i < input.length(); i++) {
            s[i] = Character.toString(input.charAt(i));
        }


        // 배열 s를 뒤에서부터 스택에 push
        for (int j = s.length - 1; j >= 0; j--) {
            push(s[j], stack);
        }

        for(String num : stack) {
            System.out.print(num);
        }

        System.out.println();

        // 스택에서 pop을 시도 (예: 한번 꺼내기)
       String popped = pop(stack);
        if (popped != null) {
            System.out.println("팝한 값: " + popped);
        }

        String peeked = peek(stack);

        System.out.println(peeked);

    }

    // 스택이 다 찼는지 확인하는 함수
    static public boolean isFull(String[] stack) {
        return top >= stack.length;
    }

    // 스택이 비어 있는지 확인하는 함수
    static public boolean isEmpty() {
        return top == 0;
    }

    // 스택(Stack)의 맨 위(top)에 있는 요소를 확인(조회)만 하는 메서드
    static public String peek(String[] stack) {
        if (isEmpty()) {
            System.out.println("스택이 비어있습니다.");
            return null;
        }
        return stack[top - 1];
    }

    // 스택에 값 넣기
    static public void push(String s, String[] stack) {
        if (isFull(stack)) {
            System.out.println("스택의 크기를 초과했습니다.");
            return;
        }
        stack[top++] = s;
    }

    // 스택에 값 빼기
    static public String pop(String[] stack) {
        if (isEmpty()) {
            System.out.println("스택이 비어있습니다.");
            return null;
        }
        String value = stack[--top];  // 먼저 감소시키고, 그 인덱스의 값을 가져온다
        stack[top] = "";              // 자리 초기화 (선택 사항)
        return value;
    }
}
