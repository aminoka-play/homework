import java.util.Scanner;

class taskP {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int h = a * 60 * 60;
        int m = b * 60;
        int y = h + m + c;
        int r = d * 60 * 60;
        int j = e * 60;
        int u = r + j + f;
        int n = y - u;
        int p = Math.abs(n);
        System.out.println(p);
    }
}