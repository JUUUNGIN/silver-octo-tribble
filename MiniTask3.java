// 이름:최정인

import java.util.Scanner;

public class MiniTask3 {
    public static void main(String[] args) {

        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요.(숫자):");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        sc = new Scanner(System.in);
        int time = sc.nextInt();

        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        sc = new Scanner(System.in);
        String merit = sc.next();

        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        sc = new Scanner(System.in);
        String welfare = sc.next();
        
        int price;
        int a = 10000;
        int b = 8000;
        int c = 4000;
        int d = 0;

        if (age < 3) {
            price = d;
        } else if (age < 13) {
            price = c;
        } else if (time > 17) {
            price = c;
        } else if (merit.equals("y")) {
            price = b;
        } else if (welfare.equals("y")) {
            price = b;
        } else {
            price = a;
        }
        System.out.println(price);
    }
}
