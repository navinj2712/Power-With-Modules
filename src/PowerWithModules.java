import java.util.Scanner;

public class PowerWithModules {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A : ");
        int A = scanner.nextInt();
        System.out.println("Enter B : ");
        int B = scanner.nextInt();
        System.out.println("Enter C : ");
        int C = scanner.nextInt();
        int output = findPowerWithModules(A, B, C);
        System.out.println("Output : " + output);
    }

    private static int findPowerWithModules(int a, int b, int c) {
        a = a % c;
        int sum = 1;
        for (int i = 0; i < b; i++){
            sum *= a % c;
        }
        return sum % c;
    }
}
