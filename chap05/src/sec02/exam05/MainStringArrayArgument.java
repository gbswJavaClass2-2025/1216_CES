package sec02.exam05;

import java.util.Objects;

public class MainStringArrayArgument {
    public static void main(String[] args) {
        int cnt = 0;

//        System.out.println(args[args.length - 1]);
//        System.out.println(args[args.length - 1] instanceof String);
//        System.out.println(args[args.length - 1].equals("+"));

        // args 의 마지막 값은 연산자

        if (args.length <= 2) {
            System.out.println("값의 수가 부족합니다.");
            System.exit(0);
        }

        else {
            cnt = Integer.parseInt(args[0]);
            for (int i = 1; i < args.length - 1; i++) {
                if(((String) args[args.length - 1]).equals("+")) {
                    cnt += Integer.parseInt(args[i]);
                }
                else if (((String) args[args.length - 1]).equals("-")) {
                    cnt -= Integer.parseInt(args[i]);
                }
                else if (((String) args[args.length - 1]).equals("*")) {
                    cnt *= Integer.parseInt(args[i]);
                }
                else if (((String) args[args.length - 1]).equals("/")) {
                    cnt /= Integer.parseInt(args[i]);
                }
            }
        }

        System.out.println(cnt);
    }
}
