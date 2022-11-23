import java.util.Scanner;
public class RecursiveUsluSayi {
    static int exponentiation(int a, int b){
        if (b == 0){
            return 1;
        }else {
            return a * exponentiation(a, b-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        System.out.print("Taban değeri giriniz: ");
        n1 = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        n2 = input.nextInt();

        System.out.print("Üs alma sonucu: " + exponentiation(n1,n2));

    }
}