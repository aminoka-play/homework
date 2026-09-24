import java.util.Scanner;

class taskI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int b = n % 10;
        int y = n / 100;
        int u = n % 100;
        int i = u / 10;
        int j = b + y + i;
        System.out.println(j);
    }
}
