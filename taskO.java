import java.util.Scanner;

class taskO {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int total = (a * 100 + b) * n;

        int rubles = total / 100;
        int kopecks = total % 100;

        System.out.println(rubles + " " + kopecks);
    }
}
