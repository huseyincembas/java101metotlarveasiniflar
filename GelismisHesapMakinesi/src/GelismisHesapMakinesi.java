import java.util.Scanner;
public class GelismisHesapMakinesi {

    static void addition(int a, int b){
        int result = a + b;
        System.out.println("Toplama işlemi sonucu: " + result);
    }

    static void subtraction(int a, int b){
        int result = a - b;
        System.out.println("Çıkarma işlemi sonucu: " + result);
    }

    static void multiplication(int a, int b){
        int result = a * b;
        System.out.println("Çarpma işlemi sonucu: " + result);
    }

    static void division(double a, double b){
        if(b == 0){
            System.out.println("2. sayı 0 olamaz.");
        }else {
            double result = a / b;
            System.out.println(result);
        }
    }

    static void exponential(int a, int b){
        int result = 1;
        for(int i = 1; i <= b; i++){
            result *= a;
        }
        System.out.println("Üslü sayı sonucu: " + result);
    }

    static void factorial(int a){
        int result = 1;
        if(a < 0){
            System.out.println("Sayı 0 veya pozitif olmalıdır.");
        }else{
        for(int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println("Faktöriyel sonucu: " + result);
        }
    }

    static void modulo(int a, int b){
        int result = a % b;
        System.out.println("Mod sonucu: " + result);
    }

    static void rectangular(int a, int b){
        int areaResult, perimeterResult;
        areaResult = a * b;
        perimeterResult = (a + b) * 2;
        System.out.println("Dikdörtgen Alanı: " + areaResult);
        System.out.println("Dikdörtgen Çevresi: " + perimeterResult);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int select, n1 = 0, n2 = 0;
        System.out.println("1- Toplama işlemi\n" +
                "2- Çıkarma işlemi\n" +
                "3- Çarpma işlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü sayı hesaplama\n" +
                "6- Faktöriyel hesaplama\n" +
                "7- Mod alma\n" +
                "8- Dikdörtgen alan ve çevre hesabı\n" +
                "0- Çıkış yap");


        do{
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            select = input.nextInt();
            if(select >= 1 && select <= 8) {
                System.out.print("İlk sayıyı giriniz: ");
                n1 = input.nextInt();
            }
            if ((select >= 1 && select <= 5) || (select >= 7 && select <= 8)) {
                System.out.print("İkinci sayıyı giriniz: ");
                n2 = input.nextInt();
            }

            switch (select){
                case 1:
                    addition(n1,n2);
                    break;
                case 2:
                    subtraction(n1,n2);
                    break;
                case 3:
                    multiplication(n1, n2);
                    break;
                case 4:
                    division(n1, n2);
                    break;
                case 5:
                    exponential(n1, n2);
                    break;
                case 6:
                    factorial(n1);
                    break;
                case 7:
                    modulo(n1, n2);
                    break;
                case 8:
                    rectangular(n1, n2);
                    break;
                case 0:
                    System.out.println("Görüşmek üzere!");
                    break;
                default:
                    System.out.println("Geçerli bir işlem seçiniz.");
                    break;
            }
        }while(select != 0);
    }
}