import java.util.Scanner;

class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;

        System.out.println("Enter " +n+" elements:");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }

        System.out.println("Sum:" +sum);
    }
}