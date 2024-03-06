//이름:최정인

import java.time.LocalDate;
import java.util.Scanner;

public class MiniTask5 {

    public static void displayCalendar(int year, int month) {
        LocalDate date = LocalDate.of(year, month, 1); 

        for (int i = 0; i < 3; i++) {
            date = date.withMonth(month - 1 + i);  
            System.out.printf("[%d년 %02d월]\n", year, (month - 1 + i)); 
            System.out.print("일\t월\t화\t수\t목\t금\t토\n");


            for (int j = 0; j < (date.getDayOfWeek().getValue()) % 7; j++) { 
                System.out.print("\t");
            }

            for (int j = 0; j < date.lengthOfMonth(); j++) { 
                date = date.withDayOfMonth(j + 1); 
                System.out.printf("%02d\t", date.getDayOfMonth()); 
                if (date.getDayOfWeek().getValue() == 6) 
                { 
                    System.out.println();
                }
            }
            date = date.withDayOfMonth(1); 

            System.out.println();
        }

    }


    public static void main(String[] args) {
        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요.(yyyy): ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        System.out.print("달력의 월을 입력해 주세요.(mm): ");
        int month = sc.nextInt();

        displayCalendar(year, month);

    }
}
