package procedure01;

public class HelloBiodome07 {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("-> 염기서열이 입력되지 않았습니다.");
            System.exit(0);
        }

        for(int i = 0; i < args[0].length(); i++) {
            char ch = Character.toUpperCase(args[0].charAt(i));
            if(ch != 'C' &&
               ch != 'Y' &&
               ch != 'J' &&
               ch != 'E' &&
               ch != 'H') {

                System.out.println("-> 염기서열은 C, J, H, E, Y 다섯가지로만 입력됩니다. 확인하고 다시 입력해주세요");
                System.exit(0);
            }
        }


        String[] dna_array = args;
        String dna = blank(dna_array);


        String result = "";
        int count = 1;

        for (int i = 1; i < dna.length(); i++) {
            char current = dna.charAt(i);
            char previous = dna.charAt(i - 1);

            if (current == previous) {
                count++;
            } else {
                result += previous + String.valueOf(count);
                count = 1;
            }
        }

        result += dna.charAt(dna.length() - 1) + String.valueOf(count);

        System.out.println("-> " + result);



    }

    public static String blank(String[] args) {
        String result = "";
        for(int i = 0; i < args.length; i++) {
            result += args[i];
        }
        return result;
    }
}
