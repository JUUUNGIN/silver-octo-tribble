//최정인
public class miniTask01 {
    public static void main(String[] args) {

        System.out.println("[구구단 출력]");


        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                int k = i*j;

                String ii = String.format("%02d",i);
                String jj = String.format("%02d",j);
                String kk = String.format("%02d",k);
                System.out.print(jj + " x " + ii +" = "+ kk);
                System.out.print('\t');
            }

            System.out.println();

        }
