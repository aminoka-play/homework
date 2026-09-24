import java.util.Scanner;

class taskE {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int j = k * n;

        if (j >= 109) {
            int c = j % 109;
            System.out.println(c);
        }
        else if (j >= 0) {
            int p = j;
            System.out.println(p);
        }
        else {
            int h = j % 109;

            if (h < 0) {
                h = h + 109;
            }

            System.out.println(h);
        }
    }
}
