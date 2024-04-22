public class q2_while {
    public static void main(String[] args) {
        int sayi = 0;

        while (sayi < 30) {
            sayi++;
            if(sayi % 2 == 0)
            {
                System.out.println(sayi + " sayısı çift sayıdır.");
            }
            else{
                System.out.println(sayi + " sayısı tek sayıdır.");
            }
        }
    }
}


