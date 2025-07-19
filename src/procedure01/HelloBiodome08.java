package procedure01;

public class HelloBiodome08 {

    // 사전 단어 목록 (가장 긴 단어부터 정렬되어야 함)
    private static final String[] DICTIONARY = {
            "solution", "please", "problem", "biodome", "thanks",
            "there", "where", "hello", "believe", "in", "isn’t", "help",
            "need", "your", "tree", "new", "this", "any", "can",
            "you", "the", "for", "is", "we", "a", "?"
    };

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("문장을 입력하세요.");
            return;
        }

        String input = args[0];
        boolean endsWithQuestionMark = input.endsWith("?");
        String result = segmentSentence(input);

        if (!endsWithQuestionMark) {
            result += ".";
        }

        System.out.println(result);
    }

    // 메시지를 단어 기준으로 분할하는 함수
    public static String segmentSentence(String message) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int len = message.length();

        while (i < len) {
            String match = null;
            int matchLen = 0;

            // 긴 단어부터 매칭
            for (String word : DICTIONARY) {
                int wordLen = word.length();
                if (i + wordLen <= len) {
                    String sub = message.substring(i, i + wordLen);
                    if (sub.equals(word)) {
                        match = sub;
                        matchLen = wordLen;
                        break;  // 첫 번째로 매칭된 가장 긴 단어 선택
                    }
                }
            }

            if (match != null) {
                // 이전에 단어가 있었다면 공백 추가
                if (result.length() > 0 && result.charAt(result.length() - 1) != ' ') {
                    result.append(" ");
                }

                result.append(match);
                i += matchLen;

                // 물음표로 끝난 경우엔 붙여쓰기
                if (match.equals("?") && i < len) {
                    result.append("");
                }

            } else {
                // 사전에 없는 문자일 경우
                if (result.length() > 0 && result.charAt(result.length() - 1) != ' ') {
                    result.append(" ");
                }

                result.append(message.charAt(i));
                i++;
            }
        }

        return result.toString();
    }
}
