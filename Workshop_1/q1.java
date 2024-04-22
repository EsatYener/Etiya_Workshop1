import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet ürün almak istiyorsunuz? ");
        int urunSayisi = scanner.nextInt();

        double toplamTutar = 0;

        for (int i = 1; i <= urunSayisi; i++) {
            System.out.print(i + ". ürünün fiyatı nedir? ");
            double fiyat = scanner.nextDouble();
            toplamTutar += fiyat;

        }

        System.out.println("Toplam alışveriş tutarı: " + toplamTutar + " TL");

        scanner.close();
    }
}
