// 이름:최정인

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MiniTask6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("총 진행할 투표수를 입력해 주세요.");
        int total = sc.nextInt();

        System.out.print("가상 선거를 진행할 후보자 인원을 입력해 주세요.");
        int personCounter = sc.nextInt();

        ArrayList<String> arr = new ArrayList<String>();

        for (int i = 0; i < personCounter; i++) {
            System.out.print((i+1)+"번째 후보자 이름을 입력해 주세요.");
            String name = sc.next();
            arr.add(name);
        }

        Random random = new Random();
        int num = 0;

        int[] sum = new int[personCounter];
        Arrays.fill(sum, 0);
        for (int i = 0; i < total; i++) {
            double rate = (double) (i + 1) / total * 100;

            num = random.nextInt(personCounter) + 1;

            System.out.printf("[투표진행률] : %.2f%%, %d명 투표 => %s\n", rate, (i + 1), arr.get(num - 1));
            sum[num - 1]++;

            for (int j = 0; j < personCounter; j++) {
                double personrate = (double) sum[j] / total * 100;
                System.out.printf("[기호:%d] %s", (j + 1), arr.get(j));

                if (arr.get(j).length() < 2) {
                    System.out.print("\t\t");
                } else if (arr.get(j).length() < 4) {
                    System.out.print("\t");
                }
                System.out.printf("\t%.2f%%\t(투표수: %d)\n", personrate, sum[j]);
            }
            System.out.println();
        }
        int max = 0;
        int max_index = 0;
        for (int i = 0; i < sum.length; i++) {
            if (max < sum[i]) {
                max = sum[i];
                max_index = i;
            }
        }
        System.out.println("[투표결과] 당선인: " + arr.get(max_index));
    }
}
