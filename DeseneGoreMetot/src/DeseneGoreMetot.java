import java.lang.reflect.Method;
import java.sql.SQLOutput;
import java.util.Scanner;
public class DeseneGoreMetot {

    static int metotLow(int a){
        if(a <= 0) {
            return a;
        }
        System.out.print(a + " ");
            return metotLow(a-5);
    }

    static int metotHigh(int a, int b){
        if (a == b){
            return b;
        }
        System.out.print(a + " ");
        return metotHigh( a + 5, b);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, number2;
        System.out.print("Deseni istediğiniz sayı: ");
        number = input.nextInt();
        System.out.print(metotLow(number));

        number2 = (number % 5) - 5;
        System.out.print(metotHigh(number2, number));

    }
}