import java.util.Scanner;

class taskN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int minutes = n * 45 + (n - 1) / 2 * 20 + (n - 1) % 2 * 5;

        int h = 9 + minutes / 60;
        int m = minutes % 60;

        System.out.println(h + " " + m);
    }
}
