import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2, select;
        System.out.print("1:'Toplama\n2:Çıkarma\n3:Çarpma\n4:Bölme\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Seçiminiz: ");
        select = input.nextInt();
        System.out.print("İlk sayı: ");
        number1 = input.nextInt();
        System.out.print("İkinci sayı: ");
        number2 = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplam: " + (number1 + number2));
                break;
            case 2:
                System.out.print("Fark: " + (number1- number2));
                break;
            case 3:
                System.out.print("Çarpım: " + (number1 * number2));
                break;
            case 4:
                System.out.print("Bölüm: " + (number2==0? "Bir sayı 0'a bölünemez" : (number1/number2)));
                break;
            default:
                System.out.print("Yanlış seçim yaptınız. Tekrar deneyiniz.");
        }
    }
}