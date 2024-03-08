// 이름:최정인

import java.util.Scanner;

public class MiniTask2 {
    public static void main(String[] args) {

        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요.(금액) :");
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int cashBack = price/10;
        int a;

        if (cashBack / 100 >= 3) {
             a = 300;
        } else if (cashBack / 100 >= 2) {
             a = 200;
        } else {
             a = 100;

        }
        System.out.println("결제 금액은 " + price + "원이고, 캐시백은 " + a + "원 입니다.");
    }

}
