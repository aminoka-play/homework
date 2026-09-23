import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int j = n / 60;
        int i = n % 60;
        int p = j % 24;

        if (j == 24) {
            j = 0;
            System.out.println(j + " " + i);
        }
        else if ( j > 24 ) {
            System.out.println(p + " " + i);
        }
        else {
            System.out.println( j + " " + i);
        }
    }
}
