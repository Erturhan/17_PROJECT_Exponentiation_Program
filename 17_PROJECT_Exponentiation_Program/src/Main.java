import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N, border;
        double answer;

        System.out.print("Please, enter N value: ");
        N = scan.nextInt();

        System.out.print("Please, enter border value: ");
        border = scan.nextInt();

        for (int i = 1; i <= border; i++) {
            answer = Math.pow(N, i);

            if (answer > border) {
                break;
            }

            System.out.print((int)answer + " ,");

        }
    }
}