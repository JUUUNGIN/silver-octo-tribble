//이름:최정인

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class MiniTask7 {

    public static void main(String[] args) {

        System.out.println("[로또 당첨 프로그램]");
        System.out.println();
        System.out.print("로또 개수를 입력해 주세요.(숫자1~10):");

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        if (count < 1 || count > 10) {
            System.out.println("1~10 중 숫자를 입력해주세요.");
            return;
        }

        LinkedList<LinkedList<Integer>> lottoNumberList = new LinkedList<>();

        Random random = new Random();

        for (int i = 0; i < count; i++) {
            LinkedList<Integer> lottoNumbers = new LinkedList<>();
            while (lottoNumbers.size() < 6) {
                int number = random.nextInt(45) + 1;
                if (!lottoNumbers.contains(number)) {
                    lottoNumbers.add(number);

                }
            }
            Collections.sort(lottoNumbers);
            lottoNumberList.add(lottoNumbers);

            char alphabet = (char) ('A' + i);
            System.out.println(alphabet + " " + listToString(lottoNumbers));
        }
        System.out.println();
        System.out.println("로또 발표");
        LinkedList<Integer> lottoNumbers2 = new LinkedList<>();
        while (lottoNumbers2.size() < 6) {
            int number = random.nextInt(45) + 1;
            if (!lottoNumbers2.contains(number)) {
                lottoNumbers2.add(number);

            }
        }
        Collections.sort(lottoNumbers2);
        System.out.println(listToString(lottoNumbers2));
        System.out.println();


        for (int i = 0; i < lottoNumberList.size(); i++) {
            LinkedList<Integer> lottoNumbers = lottoNumberList.get(i);
            char alphabet = (char) ('A' + i);
            int matchCount = 0;
            for (int number : lottoNumbers) {
                if (lottoNumbers2.contains(number)) {
                    matchCount++;
                }
            }
            System.out.println(alphabet + " " + listToString(lottoNumbers) + " => " + matchCount + "개 일치");
        }
    }

    private static String listToString(LinkedList<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
    }
