import java.util.Scanner;
public class RecursiveAsalSayi {
    static boolean isPrime(int a, int i){
        if (a <= 2){
            return (a == 2) ? true : false;
        }
        if (a % i == 0){
            return  false;
        }
        if(i * i > a ){
            return true;
        }
        return isPrime(a, i+1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Asal sayı sorgulama: ");
        number = input.nextInt();
        if(isPrime(number, 2)){
            System.out.print(number + " asal sayıdır.");
        }else {
            System.out.print(number + " asal sayı değildir.");
        }
    }
}