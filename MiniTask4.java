// 이름:최정인

import java.util.Scanner;
import java.util.Random;

public class MiniTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random1 = new Random();

        System.out.print("출생연도를 입력해주세요.(yyyy) :");
        int year = scanner.nextInt();

        System.out.print("출생월을 입력해주세요.(mm) :");
        int month = scanner.nextInt();

        System.out.print("출생일을 입력해주세요.(dd) :");
        int day = scanner.nextInt();

        System.out.print("성별을 입력해주세요.(m/f) :");
        String sex = scanner.next();

        int gender = (sex.equalsIgnoreCase("m")) ? 3:4;

        String rrnFront = String.format("%02d%02d%02d", year % 100, month, day);

        String rrnBack = generateRandomBack(gender, random1);
        System.out.println(rrnFront + "-" + rrnBack);

    }
private static String generateRandomBack(int gender, Random random1) {

    String back = String.format("%06d", random1.nextInt(1000000));

    return gender+ back;
}
}
