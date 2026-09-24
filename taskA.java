import java.util.Scanner;

class taskA {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int j = a * a + b * b;
        double c = Math.sqrt(j);
        System.out.println(c);
    }
}
