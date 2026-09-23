import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int b = n % 100;
        int y = b / 10;
        System.out.println(y);
    }
}
