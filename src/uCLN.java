import java.util.Scanner;

public class uCLN {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        int a, b;
        System.out.println("Enter a:");
        a = write.nextInt();
        System.out.println("Enter b:");
        b = write.nextInt();
        if (a == 0 || b == 0)
            System.out.println("No greatest common factor");

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;

        }
        System.out.println("Greatest common factor: " + a);
    }
}
