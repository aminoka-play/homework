import java.util.Scanner;

class taskQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int e = a - b;
        int y = Math.abs(e);
        int p = ( a + b - 1) / a;
        System.out.println(p);

    }
}

