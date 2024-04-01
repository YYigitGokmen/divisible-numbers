import java.util.Scanner;

public class OddorEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int k,ortalama,sayi= 0, toplam= 0;

        System.out.print("Lütfen Sayı Giriniz : ");
        k = input.nextInt();

            for (int i = 0; i <=k; i++){

            if (i % 3 == 0  &&  i%4 == 0) {
                sayi += i;
                toplam ++;
            }

        }

        ortalama = sayi/toplam;
        System.out.println("Ortalama : " + ortalama);

    }
}