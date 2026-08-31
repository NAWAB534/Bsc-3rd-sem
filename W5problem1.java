import java.util.Scanner;

class ArrayDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter " +n+ " elements:");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}