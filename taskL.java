import java.util.Scanner;

class taskL {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int h = (n / 3600) % 24;
        int m = n % 3600 / 60;
        int s = n % 60;

        System.out.print(h + ":");

        if (m < 10) {
            System.out.print("0" + m);
        } else {
            System.out.print(m);
        }

        System.out.print(":");

        if (s < 10) {
            System.out.print("0" + s);
        } else {
            System.out.print(s);
        }
    }
}
