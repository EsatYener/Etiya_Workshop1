
public class q4 {
    public static void main(String[] args) {
        int sayi = 28;  
        if (isPerfectNumber(sayi)) {
            System.out.println(sayi + " bir mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " bir mükemmel sayı değildir.");
        }
    }

    // Mükemmel sayıyı kontrol eden fonksiyon
    public static boolean isPerfectNumber(int num) { 
        if (num < 1) {
            return false;
        }
        int toplam = 0;
        
        for (int i = 1; i <= num / 2; i++) { 
            if (num % i == 0) {
                toplam += i;
            }
        }
        
        return toplam == num; 
    }
}
